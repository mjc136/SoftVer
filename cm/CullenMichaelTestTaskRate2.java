package cm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


//Name: Michael Cullen
//Student ID: C00261635
//Date: 22/10/2024
class CullenMichaelTestTaskRate2 {
    //partition cm.Rate
    @Test
    // 1
    void testValidCarParkKind1() {
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

    @Test
        // 2
    void testValidCarParkKind2() {
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

    @Test
        // 3
    void testValidCarParkKind3() {
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

    @Test
        // 4
    void testValidCarParkKind4() {
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

    @Test
        // 5
    void testValidLowBoundaryNormalRate() {
        Period reducedPeriod = new Period(12, 17);
        Period normalPeriod = new Period(17, 20);

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

    @Test
        // 6
    void testValidHighBoundaryNormalRate() {

        Period reducedPeriod = new Period(12, 17);
        Period normalPeriod = new Period(17, 20);

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

    @Test
        // 7
    void testValidLowBoundaryReducedRate() {
        Period reducedPeriod = new Period(12, 17);
        Period normalPeriod = new Period(17, 20);

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

    @Test
        // 8
    void testValidHighBoundaryReducedRate() {

        Period reducedPeriod = new Period(12, 17);
        Period normalPeriod = new Period(17, 20);

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

    @Test
        // 9
    void testInvalidLowBoundaryNormalRate() {
        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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

    @Test
        // 10
    void testInvalidHighBoundaryNormalRate() {
        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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

    @Test
        // 11
    void testInvalidLowBoundaryReducedRate() {
        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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

    @Test
        // 12
    void testInvalidHighBoundaryReducedRate() {
        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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

    @Test
        // 13
    void testInvalidReducedRateMoreThenNormalRate() {
        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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

    @Test
        // 14
    void testInvalidNullRate() {

        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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
                BigDecimal.valueOf(5)));
    }

    @Test
        // 15
    void testInvalidNullReducedRate() {

        Period reducedPeriod = new Period(0, 5);
        Period normalPeriod = new Period(5, 10);

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
                null));
    }

    @Test
        // 16
    void testInvalidNullPeriod() {

        Period reducedPeriod = new Period(0, 5);

        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(reducedPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                reducedPeriods,
                null,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(4)));
    }

    @Test
        // 17
    void testInvalidNullReducedPeriod() {

        Period normalPeriod = new Period(5, 10);

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(normalPeriod);

        CarParkKind kind = CarParkKind.STUDENT;

        assertThrows(IllegalArgumentException.class, () -> new Rate(kind,
                null,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(4)));
    }

    @Test
        // 18
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

    @Test
        // 19
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

    @Test
        // 20
    void testInvalidOverlappingReducedAndNormalPeriods() {
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(0, 5));

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(4, 8)); // Overlaps with reduced period

        assertThrows(IllegalArgumentException.class, () -> new Rate(
                CarParkKind.STUDENT,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2)
        ));
    }

    @Test
        // 21
    void testInvalidOverlapPeriods() {
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(8, 12));  // Valid period
        reducedPeriods.add(new Period(13, 18)); // Will cause isValidPeriod to return false

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 14)); // Overlaps with the second period in normal period

        assertThrows(IllegalArgumentException.class, () -> new Rate(
                CarParkKind.STUDENT,
                reducedPeriods,
                normalPeriods,
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2)
        ));
    }


    @Test // 1
    void testVisitorFreeCalculation() {
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 5));

        Rate rate = new Rate(CarParkKind.VISITOR, new ArrayList<>(), normalPeriods, BigDecimal.valueOf(5), BigDecimal.valueOf(3));

        Period periodStay = new Period(0, 2);
        Assertions.assertEquals(BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP), rate.calculate(periodStay));
    }

    @Test // 2
    void testVisitorDiscountCalculation() {
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 5));

        Rate rate = new Rate(CarParkKind.VISITOR, new ArrayList<>(), normalPeriods, BigDecimal.valueOf(5), BigDecimal.valueOf(3));

        Period periodStay = new Period(0, 5); // 5 hours * 5 = 25; (25 - 10) * 0.5 = 7.5
        Assertions.assertEquals(BigDecimal.valueOf(7.50).setScale(2, RoundingMode.HALF_UP), rate.calculate(periodStay));
    }

    @Test // 3
    void testManagementMinimumCharge() {
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8, 9));

        Rate rate = new Rate(CarParkKind.MANAGEMENT, new ArrayList<>(), normalPeriods, BigDecimal.valueOf(2), BigDecimal.valueOf(1));

        Period periodStay = new Period(8, 9); // 1 hour * 2 = 2; minimum charge = 4
        Assertions.assertEquals(BigDecimal.valueOf(4.00).setScale(2, RoundingMode.HALF_UP), rate.calculate(periodStay));
    }

    @Test // 4
    void testStudentNoDiscount() {
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8, 9));

        Rate rate = new Rate(CarParkKind.STUDENT, new ArrayList<>(), normalPeriods, BigDecimal.valueOf(5), BigDecimal.valueOf(3));

        Period periodStay = new Period(8, 9); // 1 hour * 5 = 5; no discount (<= 5.50)
        Assertions.assertEquals(BigDecimal.valueOf(5.00).setScale(2, RoundingMode.HALF_UP), rate.calculate(periodStay));
    }

    @Test // 5
    void testStudentDiscountCalculation() {
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8, 12));

        Rate rate = new Rate(CarParkKind.STUDENT, new ArrayList<>(), normalPeriods, BigDecimal.valueOf(4), BigDecimal.valueOf(2));

        Period periodStay = new Period(8, 12); // 4 hours * 4 = 16; (16 - 5.50) * 0.75 + 5.50 = 13.375
        Assertions.assertEquals(BigDecimal.valueOf(13.38).setScale(2, RoundingMode.HALF_UP), rate.calculate(periodStay));
    }

    @Test // 6
    void testStaffCapCalculation() {
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8, 16));

        Rate rate = new Rate(CarParkKind.STAFF, new ArrayList<>(), normalPeriods, BigDecimal.valueOf(3), BigDecimal.valueOf(2));

        Period periodStay = new Period(8, 16); // 8 hours * 3 = 24; capped at 16
        Assertions.assertEquals(BigDecimal.valueOf(16.00).setScale(2, RoundingMode.HALF_UP), rate.calculate(periodStay));
    }
}


