package seminars.seminarTwo.hw;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    //@BeforeAll
    //static void createCar(){
        Car car = new Car("VW", "Beatle", 1970);
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2000);
    //}


    @Test
    void carIsAVehicle(){
        assertThat(car).isInstanceOf(Vehicle.class);
    }


    @Test
    void carHasFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasFourWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carTestDrive(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleTestDrive(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carParking(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleParking(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}