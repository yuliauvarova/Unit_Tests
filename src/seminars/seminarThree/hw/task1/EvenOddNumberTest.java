package seminars.seminarThree.hw.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class EvenOddNumberTest {

    EvenOddNumber evenOddNumber;

    @BeforeEach
    void setUp(){
        evenOddNumber = new EvenOddNumber();
    }

    @ParameterizedTest
    @ValueSource(ints = {-2,0,4})
    void isEvenTrue(int n){
        assertTrue(evenOddNumber.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-3,5})
    void isEvenFalse(int n){
        assertFalse(evenOddNumber.isEven(n));
    }
}
