package DateTimeApi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0);

        if (localDateTime.toLocalTime().isAfter(LocalTime.of(7, 0))
            &&
            localDateTime.toLocalTime().isBefore(LocalTime.of(12, 0))) {
            System.out.println("time");
        }

    }
}
