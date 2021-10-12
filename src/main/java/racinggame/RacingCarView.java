package racinggame;

import nextstep.utils.Console;

public class RacingCarView {
    private static final String RACING_CAR_NAME_ENTER_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String RACING_COUNT_ENTER_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String RACING_RESULT_MESSAGE = "실행 결과";
    private static final String RACING_WINNER_MESSAGE = "최종 우승자는 %s 입니다.%n";

    public void printEnterRacingCarName() {
        System.out.println(RACING_CAR_NAME_ENTER_MESSAGE);
    }

    public void printEnterRacingCount() {
        System.out.println(RACING_COUNT_ENTER_MESSAGE);
    }

    public void printRacingPreResult() {
        System.out.println(RACING_RESULT_MESSAGE);
    }

    public void printRacingResult(String racing) {
        System.out.println(racing);
    }

    public void printRacingWinner(String winner) {
        System.out.printf(RACING_WINNER_MESSAGE, winner);
    }

    public void printCarNameRangeError() {
        System.out.println(ErrorMessage.CAR_NAME_RANGE_ERROR_MESSAGE);
    }

    public void printNumberFormatError() {
        System.out.println(ErrorMessage.NUMBER_FORMAT_ERROR_MESSAGE);
    }

    public void printLocationRangeError() {
        System.out.println(ErrorMessage.LOCATION_RANGE_ERROR_MESSAGE);
    }

    public String readLine() {
        return Console.readLine();
    }
}
