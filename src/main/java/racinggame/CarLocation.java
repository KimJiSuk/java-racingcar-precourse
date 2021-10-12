package racinggame;

public class CarLocation {
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
            throw new IllegalArgumentException(ErrorMessage.LOCATION_RANGE_ERROR_MESSAGE);
        }
    }
}
