package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    Car car;

    @BeforeEach
    void 생성() {
        car = new Car("lan");
    }

    @Test
    void 자동차_생성_이름_5자이상() {
        assertThatThrownBy(() -> new Car("capture"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("ERROR");
    }

    @Test
    void 자동차_이동() {
        car.move(1);
        assertThat(car.getCarLocation()).isEqualTo(1);
    }

    @Test
    void 자동차_중간_실행결과() {
        car.move(3);
        assertThat(car.toString()).contains("---");
    }
}
