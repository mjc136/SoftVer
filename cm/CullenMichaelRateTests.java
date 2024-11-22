//package cm;
//
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CullenMichaelRateTests{
//    //partition Rate
//    @Test // 1-4
//    void testValidCarParkKind(){
//        Period reducedPeriod = new Period(12, 15);
//
//        Period normalPeriod = new Period(15, 17);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(3));
//        Rate rate2 = new Rate(CarParkKind.STUDENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(3));
//        Rate rate3 = new Rate(CarParkKind.MANAGEMENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(3),
//                BigDecimal.valueOf(2));
//        Rate rate4 = new Rate(CarParkKind.VISITOR,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(5),
//                BigDecimal.valueOf(2));
//
//        assertNotNull(rate);
//        assertNotNull(rate2);
//        assertNotNull(rate3);
//        assertNotNull(rate4);
//    }
//
//    @Test // 5
//    void testValidLowBoundaryNormalRate(){
//        Period reducedPeriod = new Period(12,17);
//        Period normalPeriod = new Period(17,20);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(0),
//                BigDecimal.valueOf(0));
//
//        assertNotNull(rate);
//    }
//
//    @Test // 6
//    void testValidHighBoundaryNormalRate(){
//
//        Period reducedPeriod = new Period(12,17);
//        Period normalPeriod = new Period(17,20);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(10),
//                BigDecimal.valueOf(5));
//
//        assertNotNull(rate);
//    }
//    @Test // 7
//    void testValidLowBoundaryReducedRate(){
//        Period reducedPeriod = new Period(12,17);
//        Period normalPeriod = new Period(17,20);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(0));
//
//        assertNotNull(rate);
//    }
//
//    @Test // 8
//    void testValidHighBoundaryReducedRate(){
//
//        Period reducedPeriod = new Period(12,17);
//        Period normalPeriod = new Period(17,20);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(10),
//                BigDecimal.valueOf(10));
//
//        assertNotNull(rate);
//    }
//
//    @Test // 9
//    void testInvalidLowBoundaryNormalRate(){
//        Period reducedPeriod = new Period(0,5);
//        Period normalPeriod = new Period(5,10);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        assertThrows(IllegalArgumentException.class, () -> new Rate(CarParkKind.STUDENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(-1),
//                BigDecimal.valueOf(5)));
//    }
//
//    @Test // 10
//    void testInvalidHighBoundaryNormalRate(){
//        Period reducedPeriod = new Period(0,5);
//        Period normalPeriod = new Period(5,10);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        assertThrows(IllegalArgumentException.class, () -> new Rate(CarParkKind.STUDENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(11),
//                BigDecimal.valueOf(5)));
//    }
//    @Test // 11
//    void testInvalidLowBoundaryReducedRate(){
//        Period reducedPeriod = new Period(0,5);
//        Period normalPeriod = new Period(5,10);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        assertThrows(IllegalArgumentException.class, () -> new Rate(CarParkKind.STUDENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(5),
//                BigDecimal.valueOf(-1)));
//    }
//
//    @Test // 12
//    void testInvalidHighBoundaryReducedRate(){
//        Period reducedPeriod = new Period(0,5);
//        Period normalPeriod = new Period(5,10);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        assertThrows(IllegalArgumentException.class, () -> new Rate(CarParkKind.STUDENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(11),
//                BigDecimal.valueOf(11)));
//    }
//    @Test // 13
//    void testInvalidReducedRateMoreThenNormalRate(){
//        Period reducedPeriod = new Period(0,5);
//        Period normalPeriod = new Period(5,10);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        assertThrows(IllegalArgumentException.class, () -> new Rate(CarParkKind.STUDENT,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(5),
//                BigDecimal.valueOf(6)));
//    }
//
//
//    //partition Calculate
//
//    @Test // 1
//    void testValidNormalPeriodCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF  ,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(8,12);
//        assertEquals(BigDecimal.valueOf(16),rate.calculate(periodStay));
//    }
//    @Test // 2
//    void testValidReducedPeriodCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(4,8);
//        assertEquals(BigDecimal.valueOf(8),rate.calculate(periodStay));
//    }
//    @Test // 3
//    void testValidReducedAndNormalCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(4,12);
//        assertEquals(BigDecimal.valueOf(24),rate.calculate(periodStay));
//    }
//    @Test // 4
//    void testValidFreeCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(0,2);
//        assertEquals(BigDecimal.valueOf(0),rate.calculate(periodStay));
//    }
//    @Test // 5
//    void testValidFreeAndReducedPeriodCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(0,8);
//        assertEquals(BigDecimal.valueOf(8),rate.calculate(periodStay));
//    }
//    @Test // 6
//    void testValidFreeAndNormalPeriodCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(8,14);
//        assertEquals(BigDecimal.valueOf(16),rate.calculate(periodStay));
//    }
//    @Test // 7
//    void testValidFreeReducedNormalCalculation(){
//        Period normalPeriod = new Period(8,12);
//        Period reducedPeriod = new Period(4,8);
//
//        // Create ArrayLists for periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(reducedPeriod);
//
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(normalPeriod);
//
//        Rate rate = new Rate(CarParkKind.STAFF,
//                reducedPeriods,
//                normalPeriods,
//                BigDecimal.valueOf(4),
//                BigDecimal.valueOf(2));
//
//        Period periodStay = new Period(0,13);
//        assertEquals(BigDecimal.valueOf(24),rate.calculate(periodStay));
//    }
//}