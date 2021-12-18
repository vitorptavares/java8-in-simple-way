package session14.date.and.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
3
/*
Para trabalhar com zonas de fuso, existe as classes ZoneId e ZonedDateTime
 */
public class ZoneIdTest {

    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();

        System.out.println(zone);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt);

        ZonedDateTime correntZt = ZonedDateTime.now();
        System.out.println(correntZt);

    }
}
