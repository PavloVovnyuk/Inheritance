import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Worker worker = new Worker("Pavlo", "Vovnyuk", LocalDate.of(1993, 04, 15));
        Worker boss = new Boss("Pavlo", "Vovnyuk", LocalDate.of(1993, 04, 15), "HR");
        System.out.println(worker);
        System.out.println(boss);


    }
}
