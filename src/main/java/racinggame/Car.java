package racinggame;

import nextstep.utils.Randoms;

public class Car {
    private final int INIT_LOCATION = 0;
    private final int MOVE_DISTANCE = 1;
    private final int NOT_MOVE_DISTANCE = 0;

    private final int RANDOM_NUMBER_START_VALUE = 0;
    private final int RANDOM_NUMBER_END_VALUE = 9;
    private final int RANDOM_NUMBER_MOVE_VALUE = 4;

    private final String name;
    private int location;

    public Car(String name) {
        this.name = setName(name);
        this.location = INIT_LOCATION;
    }

    public void play() {
        move(getDistance());
    }

    public int getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(this.name + " : ");

        for (int i = 0; i < this.location; i++) {
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

    private String setName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하입니다.");
        }
        return name;
    }

    public void move(int distance) {
        this.location += distance;
    }
}
