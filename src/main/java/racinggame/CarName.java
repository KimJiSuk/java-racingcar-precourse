package racinggame;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = validateRangeName(name);
    }

    public String getName() {
        return name;
    }

    private String validateRangeName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_RANGE_ERROR_MESSAGE);
        }
        return name;
    }
}
