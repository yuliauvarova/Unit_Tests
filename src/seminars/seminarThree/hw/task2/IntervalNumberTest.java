package seminars.seminarThree.hw.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class IntervalNumberTest {

    IntervalNumber intervalNumber;
    @BeforeEach
    void setUp(){
        intervalNumber = new IntervalNumber();
    }

    @ParameterizedTest
    @ValueSource(ints = {26,50,99})
    void isInInterval(int n){
        assertTrue(intervalNumber.isInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25,0,100,-4})
    void isNotInInterval(int n){
        assertFalse(intervalNumber.isInInterval(n));
    }
}
