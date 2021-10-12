package racinggame;

import nextstep.utils.Randoms;

public class Car {
    private static final int INIT_LOCATION = 0;
    private static final int MOVE_DISTANCE = 1;
    private static final int NOT_MOVE_DISTANCE = 0;

    private static final int RANDOM_NUMBER_START_VALUE = 0;
    private static final int RANDOM_NUMBER_END_VALUE = 9;
    private static final int RANDOM_NUMBER_MOVE_VALUE = 4;

    private final CarName name;
    private CarLocation carLocation;

    public Car(String name) {
        this.name = new CarName(name);
        this.carLocation = new CarLocation(INIT_LOCATION);
    }

    public void play() {
        move(getDistance());
    }

    public String getCarName() {
        return this.name.getName();
    }

    public int getCarLocation() {
        return this.carLocation.getLocation();
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(this.name.getName() + " : ");

        for (int i = 0; i < this.carLocation.getLocation(); i++) {
            message.append("-");
        }

        return message.toString();
    }

    private int getDistance() {
        int r = Randoms.pickNumberInRange(RANDOM_NUMBER_START_VALUE, RANDOM_NUMBER_END_VALUE);

        if (r >= RANDOM_NUMBER_MOVE_VALUE) {
            return MOVE_DISTANCE;
        }

        return NOT_MOVE_DISTANCE;
    }

    public void move(int distance) {
        this.carLocation = this.carLocation.move(distance);
    }
}
