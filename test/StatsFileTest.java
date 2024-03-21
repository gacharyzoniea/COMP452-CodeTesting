import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

//    void invalidDate() throws Exception{
//        String[] values = new String[]
//    }




}
