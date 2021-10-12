package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final String SPLIT_REGEX = ",";
    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = convertCars(carNames);
    }

    public void play() {
        for (Car car : cars) {
            car.play();
        }
    }

    public String getWinners() {
        int longestLocation = getLongestLocation();
        StringBuilder winnerNames = new StringBuilder();

        for (Car car : cars) {
            winnerNames.append(getWinner(car, longestLocation));
        }

        return winnerNames.substring(0, winnerNames.length() - 1);
    }

    public String getWinner(Car car, int location) {
        if (car.isLocation(location)) {
            return car.getCarName() + SPLIT_REGEX;
        }

        return "";
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
