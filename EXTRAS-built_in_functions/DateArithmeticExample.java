import java.time.LocalDate;

public class DateArithmeticExample {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 6, 15); // Sample input date

        System.out.println("Input date: " + inputDate);

        LocalDate resultDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + resultDate);

        resultDate = resultDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + resultDate);
    }
}
