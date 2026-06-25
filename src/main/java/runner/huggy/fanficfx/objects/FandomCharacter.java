package runner.huggy.fanficfx.objects;

public class FandomCharacter {
    private int idFandomCharacter;
    private String nameCharacter;
    private int idFandom;

    public FandomCharacter(int idFandomCharacter, String nameCharacter, int idFandom) {
        this.idFandomCharacter = idFandomCharacter;
        this.nameCharacter = nameCharacter;
        this.idFandom = idFandom;
    }

    // Getter and Setter : idFandomCharacter
    public int getIdFandomCharacter() {
        return idFandomCharacter;
    }

    public void setIdFandomCharacter(int idFandomCharacter) {
        this.idFandomCharacter = idFandomCharacter;
    }

    // Getter and Setter : nameCharacter
    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    // Getter and Setter : idFandom
    public int getIdFandom() {
        return idFandom;
    }

    public void setIdFandom(int idFandom) {
        this.idFandom = idFandom;
    }
}
