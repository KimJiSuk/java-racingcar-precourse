package racinggame;

public class RacingCar {
    RacingCarView racingCarView = new RacingCarView();
    private final Cars cars;

    public RacingCar() {
        this.cars = generateRacing();
    }

    public Cars generateRacing() {
        try {
            racingCarView.printEnterRacingCarName();
            String names = racingCarView.readLine();
            return new Cars(names);
        } catch (IllegalArgumentException ignore) {
            racingCarView.printCarNameRangeError();
            return generateRacing();
        }
    }

    public void startRacing() {
        try {
            racingCarView.printEnterRacingCount();
            int laps = Integer.parseInt(racingCarView.readLine());
            racingCarView.printRacingPreResult();
            runRacing(laps);
        } catch (NumberFormatException ignore) {
            racingCarView.printNumberFormatError();
            startRacing();
        }
    }

    private void runRacing(int laps) {
        for (int i = 0; i < laps; i++) {
            cars.play();
            racingCarView.printRacingResult(cars.toString());
        }
    }

    public void endRacing() {
        racingCarView.printRacingWinner(cars.getWinners());
    }
}
