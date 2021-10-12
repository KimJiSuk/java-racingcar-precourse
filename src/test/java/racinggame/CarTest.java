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
        car.play();
        car.play();
        car.play();
        assertThat(car.getCarLocation()).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(3);
    }

    @Test
    void 자동차_중간_실행결과() {
        car.play();
        car.play();
        car.play();

        if (car.isLocation(0)) {
            assertThat(car.toString()).contains("lan : ");
        } else if (car.isLocation(1)) {
            assertThat(car.toString()).isEqualTo("lan : -");
        } else if (car.isLocation(2)) {
            assertThat(car.toString()).isEqualTo("lan : --");
        } else if (car.isLocation(3)) {
            assertThat(car.toString()).isEqualTo("lan : ---");
        }
    }
}
