import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatsFileTest {

    //add value
    @Test
    void dateEarlyTest(){
        String[] values = new String[] {"2020-02-24T20:10:40.110278500", "3"};

        StatsFile file = new StatsFile();
        System.out.println(file.getStatsMap().get(3));
        LocalDateTime limit = LocalDateTime.now();
        LocalDateTime timeToAdd = LocalDateTime.of(LocalDateTime.now().getYear() + 1, Month.APRIL, 29, 19, 30);
        file.addValues(values, limit);
        System.out.println(file.getStatsMap().get(3));
        assertEquals(1, file.getStatsMap().get(3).intValue());
    }

    @Test
    void countIsBogus(){
        String[] values = new String[] {"2024-02-24T20:10:40.110278500", "ten"};
        StatsFile file = new StatsFile();
        LocalDateTime limit = LocalDateTime.now();
        assertThrows(NumberFormatException.class, () -> file.addValues(values, limit));
    }

    @Test
    void invalidDate() {
        String[] values = {"A really bad date", "35"};
        LocalDateTime limit = LocalDateTime.now();
        StatsFile file = new StatsFile();
        assertThrows(DateTimeParseException.class, ()->{file.addValues(values, limit);});
    }


}
