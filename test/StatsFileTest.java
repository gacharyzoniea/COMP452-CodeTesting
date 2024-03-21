import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class StatsFileTest {

    //add value
    @Test
    void dateLateTest(){
        String[] values = new String[] {"2020-02-24T20:10:29.110278500", "2", "2020-02-24T20:56:09.088002200", "3", "2024-03-21T15:58:07.255450800", "4"};

        StatsFile file = new StatsFile();
        LocalDateTime limit = LocalDateTime.now();
        LocalDateTime timeToAdd = LocalDateTime.of(LocalDateTime.now().getYear() + 1, Month.APRIL, 29, 19, 30);
        file.addValues();
    }

    void invalidDate() throws Exception{
        String[] values = new String[]
    }




}
