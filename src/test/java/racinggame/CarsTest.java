package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {

    Cars cars;

    @BeforeEach
    void 생성() {
        cars = new Cars("lan, lla, abc, zzz");
    }

    @Test
    void 플레이() {
        cars.play();
        cars.play();
        cars.play();
        cars.play();

        System.out.println(cars.toString());
        System.out.println(cars.getWinners());
    }
}
