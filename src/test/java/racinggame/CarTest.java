package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_생성() {
        new Car("lan");
    }

    @Test
    void 자동차_생성_이름_5자이상() {
        assertThatThrownBy(() -> new Car("capture"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("ERROR");
    }

    @Test
    void 자동차_이동() {
        Car car = new Car("lan");
        car.move(1);
        assertThat(car.getCarLocation()).isEqualTo(1);
    }

    @Test
    void 자동차_중간_실행결과() {
        Car car = new Car("lan");
        car.move(3);
        assertThat(car.toString()).contains("---");
    }
}
