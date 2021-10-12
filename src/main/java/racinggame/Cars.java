package racinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private static final String SPLIT_REGEX = ",";
    private static final String EMPTY_CAR_NAME = "";
    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = convertCars(carNames);
    }

    public void play() {
        for (Car car : cars) {
            car.play();
        }
    }

    public List<String> getWinners() {
        int longestLocation = getLongestLocation();
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            winners.add(getWinner(car, longestLocation));
        }

        winners.removeAll(Collections.singletonList(EMPTY_CAR_NAME));
        return winners;
    }

    private String getWinner(Car car, int location) {
        if (car.isLocation(location)) {
            return car.getCarName();
        }

        return EMPTY_CAR_NAME;
    }

    private int getLongestLocation() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(car.getCarLocation(), max);
        }

        return max;
    }

    private List<Car> convertCars(String carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames.split(SPLIT_REGEX)) {
            cars.add(new Car(carName.trim()));
        }

        return cars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Car car : cars) {
            sb.append(car.toString()).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
