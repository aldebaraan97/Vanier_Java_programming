package programming_concepts_I.LAB6;

public class MonthDays {
    private int month, year;

    public MonthDays() {}

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getNumberOfDays() {
        int numberOfDays = 0;
        numberOfDays = switch (getMonth()) {
            case 1 -> 31;
            case 2 -> (isLeapYear() ? 29 : 28);
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 30;
            case 9 -> 31;
            case 10 -> 30;
            case 11 -> 31;
            case 12 -> 30;
            default -> 0;
        };
        return numberOfDays;
    }

    private boolean isLeapYear(){
        return year % 100 == 0 && year % 400 == 0;
    }

    public int getMonth() {
        return month;
    }
}
