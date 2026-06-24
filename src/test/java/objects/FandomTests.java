package objects;

import org.junit.jupiter.api.Test;
import runner.huggy.fanficfx.objects.Fandom;
import runner.huggy.fanficfx.objects.enums.FandomType;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is a classic test that verifies the getters are okay.
 * TODO: Find a way that the Date we use can't be deprecated.
 */
public class FandomTests {

    @Test
    public void testGetIdFandom(){
        Fandom fandom = new Fandom(1,
                "Robin Hood",
                FandomType.MOVIE,
                Date.from(Instant.parse("1973-11-08")));

        int id = fandom.getIdFandom();

        assertEquals(1, id);
    }

    @Test
    public void testGetNameFandom(){
        Fandom fandom = new Fandom(1,
                "Robin Hood",
                FandomType.MOVIE,
                Date.from(Instant.parse("1973-11-08")));

        String nameFandom = fandom.getNameFandom();

        assertEquals("Robin Hood", nameFandom);
    }

    @Test
    public void testGetFandomType(){
        Fandom fandom = new Fandom(1,
                "Robin Hood",
                FandomType.MOVIE,
                Date.from(Instant.parse("1973-11-08")));

        String fandomType = fandom.getFandomType();

        assertEquals("Movie", fandomType);
    }

    @Test
    public void testGetDateRelease(){
        Fandom fandom = new Fandom(1,
                "Robin Hood",
                FandomType.MOVIE,
                new Date(1973, Calendar.NOVEMBER, 8));

        Date date = fandom.getDateRelease();

        assertEquals(new Date(1973, Calendar.NOVEMBER, 8), date);
    }
}
