package racinggame;

public class CarName {
    private static final String CAR_NAME_RANGE_ERROR_MESSAGE = "[ERROR] 자동차 이름은 5자 이하입니다.";
    private final String name;

    public CarName(String name) {
        this.name = validateRangeName(name);
    }

    public String getName() {
        return name;
    }

    private String validateRangeName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_RANGE_ERROR_MESSAGE);
        }
        return name;
    }
}
