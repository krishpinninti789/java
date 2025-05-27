import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        Date d1 = new Date();
        // System.out.println("Current date and Time is"+d1);
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.print(ld);
        System.out.print(lt);
    }
}
