public class Period {
    private int startHour;
    private int endHour;

    // Constructor with boundary validation
    public Period(int start, int end) {
        if (start < 0 || start >= 24) {
            throw new IllegalArgumentException("Start hour must be between 0 and 23.");
        }
        if (end <= start || end > 24) {
            throw new IllegalArgumentException("End hour must be greater than start hour and less than or equal to 24.");
        }

        this.startHour = start;
        this.endHour = end;
    }

    // Method to check if two periods overlap
    public boolean overlaps(Period other) {
        // Two periods overlap if they intersect in any way
        return this.startHour < other.endHour && other.startHour < this.endHour;
    }

    // Method to calculate the duration of the period
    public int duration() {
        return endHour - startHour;
    }

    // Getters (optional, if needed)
    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }
}
