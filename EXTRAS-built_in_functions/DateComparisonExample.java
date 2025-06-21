import java.time.LocalDate;

public class DateComparisonExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 6, 15);
        LocalDate date2 = LocalDate.of(2023, 7, 1);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after Date 2");
        } else if (date1.isEqual(date2)) {
            System.out.println("Date 1 is the same as Date 2");
        }
    }
}
