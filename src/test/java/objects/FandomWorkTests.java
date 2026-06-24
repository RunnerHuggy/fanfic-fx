package objects;

import org.junit.jupiter.api.Test;
import runner.huggy.fanficfx.objects.FandomWork;
import runner.huggy.fanficfx.objects.enums.FandomStatus;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is a classic Unit Test to see if the getters work
 */
public class FandomWorkTests {

    // TODO: Find a Way to make sure that the Date isn't deprecated while using the Calendar thing.

    @Test
    public void testGetId(){
        FandomWork work = new FandomWork(1,
                "Ninja Gaiden - The Four Misfits",
                new Date(2026, Calendar.JANUARY, 1),
                "WIP",
                new Date(2026, Calendar.JANUARY, 1),
                FandomStatus.WIP);

        int idWork = work.getIdWork();

        assertEquals(1, idWork);
    }

    @Test
    public void testGetNameWork(){
        FandomWork work = new FandomWork(1,
                "Ninja Gaiden - The Four Misfits",
                new Date(2026, Calendar.JANUARY, 1),
                "WIP",
                new Date(2026, Calendar.JANUARY, 1),
                FandomStatus.WIP);

        String nameWork = work.getNameWork();

        assertEquals("Ninja Gaiden - The Four Misfits", nameWork);
    }

    @Test
    public void testGetDateReleased(){
        FandomWork work = new FandomWork(1,
                "Ninja Gaiden - The Four Misfits",
                new Date(2026, Calendar.JANUARY, 1),
                "WIP",
                new Date(2026, Calendar.JANUARY, 1),
                FandomStatus.WIP);

        Date releaseDate = work.getReleaseDate();

        assertEquals(new Date(2026, Calendar.JANUARY, 1), releaseDate);
    }

    @Test
    public void testGetSummary(){
        FandomWork work = new FandomWork(1,
                "Ninja Gaiden - The Four Misfits",
                new Date(2026, Calendar.JANUARY, 1),
                "WIP",
                new Date(2026),
                FandomStatus.WIP);

        String summary = work.getSummaryWork();

        assertEquals("WIP", summary);
    }

    @Test
    public void testGetModifiedDate(){
        FandomWork work = new FandomWork(1,
                "Ninja Gaiden - The Four Misfits",
                new Date(2026, Calendar.JANUARY, 1),
                "WIP",
                new Date(2026, Calendar.JANUARY, 1),
                FandomStatus.WIP);

        Date modifiedDate = work.getModifiedDate();

        assertEquals(new Date(2026, Calendar.JANUARY, 1), modifiedDate);
    }

    @Test
    public void testGetStatus(){
        FandomWork work = new FandomWork(1,
                "Ninja Gaiden - The Four Misfits",
                new Date(2026, Calendar.JANUARY, 1),
                "WIP",
                new Date(2026, Calendar.JANUARY, 1),
                FandomStatus.WIP);

        FandomStatus status = work.getStatus();

        assertEquals(FandomStatus.WIP, status);
    }
}
