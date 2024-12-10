import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        for(Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(5, 4);
        shape1.calculateArea();
        shape2.calculateArea();

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2020, 12, 28);
        Main main = new Main();
        main.difference(localDate1, localDate2);
        main.nextDayOfWeek(localDate1);
        main.remainDays(localDate1);
        main.calculateBirthDate(localDate1, localDate2);
        main.nextMonthDayOfWeek(localDate1);
    }

    private void nextMonthDayOfWeek(LocalDate localDate1) {
        System.out.println(localDate1.plusMonths(1).getDayOfWeek());
    }

    private void calculateBirthDate(LocalDate localDate1, LocalDate localDate2) {
        long year = localDate1.getYear() - localDate2.getYear();
        System.out.println(year);
        if (localDate2.getMonth().getValue() > localDate1.getMonth().getValue() ||
                localDate2.getMonth().getValue() == localDate1.getMonth().getValue() &&
                        localDate2.getDayOfMonth() > localDate1.getDayOfMonth())
            year -= 1;

        System.out.println(year);

    }

    private void remainDays(LocalDate localDate1) {
        int passDate = localDate1.getDayOfYear();
        int yearDays = localDate1.isLeapYear() ? 366 : 365;
        System.out.println(yearDays - passDate);
    }

    private void nextDayOfWeek(LocalDate localDate1) {
        LocalDate localDate2 = localDate1.plusDays(1);
        while ((localDate2 = localDate2.plusDays(1)).getDayOfWeek() != localDate1.getDayOfWeek()) {

        }
        System.out.println(localDate2);
    }

    void difference(LocalDate localDate1, LocalDate localDate2) {
        System.out.println(localDate2.until(localDate1, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.between(localDate2, localDate1));
    }

    public void forFaktorial(int a) {
    }
}
