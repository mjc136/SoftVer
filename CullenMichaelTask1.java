//package cm;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

//Name: Michael Cullen
//Student ID: C00261635
//Date: 22/10/2024

//Dummy classes for Period and Rate were created by ChatGPT
class Period{
    private int startHour;
    private int endHour;

    // Constructor
    public Period(int start, int end) {
        this.startHour = start;
        this.endHour = end;
    }

    // Dummy method to simulate overlap
    public boolean overlaps(Period period) {
        return false;
    }

    // Dummy method to return duration
    public int duration() {
        return endHour - startHour;
    }
}

class Rate{
    private CarParkKind kind;
    private ArrayList<Period> reducedPeriods;
    private ArrayList<Period> normalPeriods;
    private BigDecimal normalRate;
    private BigDecimal reducedRate;

    // Constructor
    public Rate(CarParkKind kind, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods, BigDecimal normalRate, BigDecimal reducedRate) {
        this.kind = kind;
        this.reducedPeriods = reducedPeriods;
        this.normalPeriods = normalPeriods;
        this.normalRate = normalRate;
        this.reducedRate = reducedRate;
    }

    // Dummy calculate method
    public BigDecimal calculate(Period periodStay) {
        return BigDecimal.ZERO;
    }

    // Enum for CarParkKind as mentioned
    public enum CarParkKind {
        Staff, Student, Management, Visitor
    }
}

//Dummy classes for Period and Rate were created by ChatGPT



class PeriodTest{
    //partition Period
    @Test // 1
    void testValidLowBoundary(){
        Period period = new Period(0,1);
        assertNotNull(period);
    }

    @Test // 2
    void testValidHighBoundary(){
        Period period = new Period(23,24);
        assertNotNull(period);
    }

    @Test // 3
    void testInvalidLowBoundaryStart(){
        assertThrows(IllegalArgumentException.class, () -> new Period(-1, 5));
    }

    @Test // 4
    void testInvalidLowBoundaryEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(0, 0));
    }

    @Test // 5
    void testInvalidHighBoundaryStart(){
        assertThrows(IllegalArgumentException.class, () -> new Period(24,24));
    }

    @Test // 6
    void testInvalidHighBoundaryEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(23,25));
    }

    @Test // 7
    void testInvalidStartEqualsEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(2,2));
    }

    @Test // 8
    void testInvalidStartLessThenEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(8,7));
    }


    //partition Duration

    @Test // 1
    void ValidLowRange(){
        Period period = new Period(0,1);
        assertEquals(1,period.duration());
    }

    @Test // 2
    void testValidHighRange(){
        Period period = new Period(0,24);
        assertEquals(24,period.duration());
    }


    //partition Overlaps
    @Test // 1
    void testValidNoOverlap(){
        Period period = new Period(8,12);
        Period period2 = new Period(13,18);
        assertFalse(period.overlaps(period2));
    }

    @Test // 2
    void testValidOverLap(){
        Period period = new Period(12,17);
        Period period2 = new Period(14,16);
        assertTrue(period.overlaps(period2));
    }
}

class RateTest{
    //partition Rate
    @Test
    void testValidCarParkKind(){
        Period period = new Period(12,15);
        Period period2 = new Period(15,17);

        // Create ArrayLists for periods
        ArrayList<Period> periods = new ArrayList<>();
        periods.add(period);

        ArrayList<Period> periods2 = new ArrayList<>();
        periods2.add(period2);

        Rate rate = new Rate(Rate.CarParkKind.Student,
                periods,
                periods2,
                BigDecimal.valueOf(4.00),
                BigDecimal.valueOf(3));
    }



    //partition Calculate
}

class CullenMichaelTask1{





}