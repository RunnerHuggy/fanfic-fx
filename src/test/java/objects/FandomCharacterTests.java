package objects;

import org.junit.jupiter.api.Test;
import runner.huggy.fanficfx.objects.FandomCharacter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FandomCharacterTests {
    @Test
    public void testGetIdFandomCharacter(){
        FandomCharacter character = new FandomCharacter(1, "Hyde", 1);

        int idFandomCharacter = character.getIdFandomCharacter();

        assertEquals(1, idFandomCharacter);
    }

    @Test
    public void testGetNameCharacter(){
        FandomCharacter character = new FandomCharacter(1, "Hyde", 1);

        String nameCharacter = character.getNameCharacter();

        assertEquals("Hyde", nameCharacter);
    }

    @Test
    public void testGetIdFandom(){
        FandomCharacter character = new FandomCharacter(1, "Hyde", 1);

        int idFandom = character.getIdFandom();

        assertEquals(1, idFandom);
    }
}
