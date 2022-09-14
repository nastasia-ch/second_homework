package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest1() {
        Assertions.assertFalse(10<0);
    }

    @Test
    void exampleTest2() {
        Assertions.assertFalse(5<3);
    }

}
