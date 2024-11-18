package cm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


//Name: Michael Cullen
//Student ID: C00261635
//Date: 22/10/2024
class CullenMichaelTestTaskRate2{
    //partition cm.Rate
    @Test // 1
    void testValidCarParkKind1(){
        Period reducedPeriod = new Period(12, 15);
        Period normalPeriod = new Period(15, 17);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STAFF;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(3));

        assertNotNull(rate);
    }
    @Test // 2
    void testValidCarParkKind2(){
        Period reducedPeriod = new Period(12, 15);
        Period normalPeriod = new Period(15, 17);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(3));


        assertNotNull(rate);
    }

    @Test // 3
    void testValidCarParkKind3(){
        Period reducedPeriod = new Period(12, 15);
        Period normalPeriod = new Period(15, 17);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.MANAGEMENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(3),
                BigDecimal.valueOf(2));


        assertNotNull(rate);
    }

    @Test // 4
    void testValidCarParkKind4(){
        Period reducedPeriod = new Period(12, 15);
        Period normalPeriod = new Period(15, 17);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.VISITOR;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2));


        assertNotNull(rate);
    }

    @Test // 5
    void testValidLowBoundaryNormalRate(){
        Period reducedPeriod = new Period(12,17);
        Period normalPeriod = new Period(17,20);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STAFF;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(0),
                BigDecimal.valueOf(0));

        assertNotNull(rate);
    }

    @Test // 6
    void testValidHighBoundaryNormalRate(){

        Period reducedPeriod = new Period(12,17);
        Period normalPeriod = new Period(17,20);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STAFF;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(5));

        assertNotNull(rate);
    }
    @Test // 7
    void testValidLowBoundaryReducedRate(){
        Period reducedPeriod = new Period(12,17);
        Period normalPeriod = new Period(17,20);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STAFF;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(0));

        assertNotNull(rate);
    }

    @Test // 8
    void testValidHighBoundaryReducedRate(){

        Period reducedPeriod = new Period(12,17);
        Period normalPeriod = new Period(17,20);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STAFF;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(10));

        assertNotNull(rate);
    }

    @Test // 9
    void testInvalidLowBoundaryNormalRate(){
        Period reducedPeriod = new Period(0,5);
        Period normalPeriod = new Period(5,10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(-1),
                BigDecimal.valueOf(-2)));
    }

    @Test // 10
    void testInvalidHighBoundaryNormalRate(){
        Period reducedPeriod = new Period(0,5);
        Period normalPeriod = new Period(5,10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(11),
                BigDecimal.valueOf(5)));
    }
    @Test // 11
    void testInvalidLowBoundaryReducedRate(){
        Period reducedPeriod = new Period(0,5);
        Period normalPeriod = new Period(5,10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(-1)));
    }

    @Test // 12
    void testInvalidHighBoundaryReducedRate(){
        Period reducedPeriod = new Period(0,5);
        Period normalPeriod = new Period(5,10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(12),
                BigDecimal.valueOf(11)));
    }
    @Test // 13
    void testInvalidReducedRateMoreThenNormalRate(){
        Period reducedPeriod = new Period(0,5);
        Period normalPeriod = new Period(5,10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(6)));
    }

    @Test // 14
    void testInvalidNullRate(){

        Period reducedPeriod = new Period(0,5);
        Period normalPeriod = new Period(5,10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                normalPeriods,
                null,
                null));
    }

    @Test // 15
    void testInvalidNullPeriod(){

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                null,
                null,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(4)));
    }
    @Test // 16
    void testInvalidOverlappingNormalPeriods() {
        Period reducedPeriod = new Period(5, 10);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 5));
        normalPeriods.add(new Period(4, 5)); // Overlaps with the previous period
        normalPeriods.add(new Period(4, 5)); // Duplicate period

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(
                kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2)
        ));
    }

    @Test // 17
    void testInvalidOverlappingReducedAndNormalPeriodsCombined() {
        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(5, 10));
        reducedPeriods.add(new Period(4, 10)); // Overlaps with the first reduced period

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(15, 20));
        normalPeriods.add(new Period(14, 20)); // Overlaps with the first normal period

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(
                kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2)
        ));
    }

    @Test // 18
    void testInvalidOverlappingReducedAndNormalPeriods() {
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(0, 5));

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(4, 8)); // Overlaps with reduced period

        assertThrows(IllegalArgumentException.class, () -> new Rate(
                CarParkKind.STUDENT, reducedPeriods, normalPeriods, BigDecimal.valueOf(5), BigDecimal.valueOf(2)
        ));
    }


    //partition Calculate

    @Test // 1
    void testValidNormalPeriodCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(8,12);
        Assertions.assertEquals(BigDecimal.valueOf(16),rate.calculate(periodStay));
    }
    @Test // 2
    void testValidReducedPeriodCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(4,8);
        Assertions.assertEquals(BigDecimal.valueOf(8),rate.calculate(periodStay));
    }
    @Test // 3
    void testValidReducedAndNormalCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(4,12);
        Assertions.assertEquals(BigDecimal.valueOf(24),rate.calculate(periodStay));
    }
    @Test // 4
    void testValidFreeCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(0,2);
        Assertions.assertEquals(BigDecimal.valueOf(0),rate.calculate(periodStay));
    }
    @Test // 5
    void testValidFreeAndReducedPeriodCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(0,8);
        Assertions.assertEquals(BigDecimal.valueOf(8),rate.calculate(periodStay));
    }
    @Test // 6
    void testValidFreeAndNormalPeriodCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(8,14);
        Assertions.assertEquals(BigDecimal.valueOf(16),rate.calculate(periodStay));
    }
    @Test // 7
    void testValidFreeReducedNormalCalculation(){
        Period normalPeriod = new Period(8,12);
        Period reducedPeriod = new Period(4,8);

        // Create ArrayLists for periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        Rate rate = new Rate(kind,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(2));

        Period periodStay = new Period(0,13);
        Assertions.assertEquals(BigDecimal.valueOf(24),rate.calculate(periodStay));
    }

    @Test // 8
    void testVisitorCalculation() {
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(0, 5));

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(5, 10));

        Rate rate = new Rate(CarParkKind.VISITOR, reducedPeriods, normalPeriods, BigDecimal.valueOf(5), BigDecimal.valueOf(3));

        Period periodStay = new Period(0, 10); // Any period for visitor
        Assertions.assertEquals(BigDecimal.ZERO, rate.calculate(periodStay));
    }

}