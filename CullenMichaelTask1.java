//package cm;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.ArrayList;

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

class CullenMichaelTask1{

    //partition Period
    @Test
    void testValidLowBoundary(){

    }


    //partition Duration



    //partition Overlaps




    //partition Rate



    //partition Calculate





}