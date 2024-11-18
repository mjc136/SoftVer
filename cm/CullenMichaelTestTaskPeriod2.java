package cm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Name: Michael Cullen
//Student ID: C00261635
//Date: 22/10/2024
class CullenMichaelTestTaskPeriod2{
    //partition cm.Period
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
    void testInvalidHighBoundaryEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(23,25));
    }

    @Test // 5
    void testInvalidStartEqualsEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(2,2));
    }

    @Test // 6
    void testInvalidStartLessThenEnd(){
        assertThrows(IllegalArgumentException.class, () -> new Period(8,7));
    }


    //partition Duration

    @Test // 1
    void ValidLowRange(){
        Period period = new Period(0,1);
        Assertions.assertEquals(1,period.duration());
    }

    @Test // 2
    void testValidHighRange(){
        Period period = new Period(0,24);
        Assertions.assertEquals(24,period.duration());
    }


    //partition Overlaps
    @Test // 1
    void testValidNoOverlap(){
        Period period = new Period(8,12);
        Period period2 = new Period(13,18);
        Assertions.assertFalse(period.overlaps(period2));
    }

    @Test // 2
    void testValidOverLap(){
        Period period = new Period(12,17);
        Period period2 = new Period(14,16);
        Assertions.assertTrue(period.overlaps(period2));
    }



}

