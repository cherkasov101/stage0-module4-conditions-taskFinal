package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month == 2 && year > 0) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(29);
            } else {
                System.out.println(28);
            }
        } else if (month >= 1 && month <= 12 && year > 0) {
            if (month < 8 && month % 2 != 0 || month > 7 && month % 2 == 0) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
