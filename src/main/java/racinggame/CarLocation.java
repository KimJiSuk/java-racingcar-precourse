package racinggame;

public class CarLocation {
    private static final String LOCATION_RANGE_ERROR_MESSAGE = "[ERROR] 현재 위치는 음수가 될 수 없습니다.";
    private final int location;

    public CarLocation(final int location) {
        validatePositiveLocation(location);
        this.location = location;
    }

    public CarLocation move(int distance) {
        return new CarLocation(this.location + distance);
    }

    public int getLocation() {
        return location;
    }

    private void validatePositiveLocation(int location) {
        if (location < 0) {
            throw new IllegalArgumentException(LOCATION_RANGE_ERROR_MESSAGE);
        }
    }
}
