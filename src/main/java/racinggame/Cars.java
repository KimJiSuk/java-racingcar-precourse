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

    public List<String> getWinner() {
        int longestLocation = getLongestLocation();
        List<String> winnerNames = new ArrayList<>();

        for (Car car : cars) {
            if (longestLocation == car.getCarLocation()) {
                winnerNames.add(car.getCarName());
            }
        }

        return winnerNames;
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
