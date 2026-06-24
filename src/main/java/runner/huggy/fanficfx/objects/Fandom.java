package runner.huggy.fanficfx.objects;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class Fandom {
    private int idFandom;
    private String nameFandom;
    private FandomType fandomType;
    private Date dateRelease;

    /**
     * Constructor of the object Fandom
     * @param idFandom the ID of the Fandom
     * @param nameFandom the name of the Fandom
     * @param fandomType the Type of the Fandom
     * @param dateRelease when the Fandom was released
     */
    public Fandom(int idFandom, String nameFandom, FandomType fandomType, Date dateRelease) {
        this.idFandom = idFandom;
        this.nameFandom = nameFandom;
        this.fandomType = fandomType;
        this.dateRelease = dateRelease;
    }

    // Getter & Setter : idFandom
    public int getIdFandom() {
        return idFandom;
    }

    public void setIdFandom(int idFandom) {
        this.idFandom = idFandom;
    }

    // Getter & Setter : nameFandom
    public String getNameFandom() {
        return nameFandom;
    }

    public void setNameFandom(String nameFandom) {
        this.nameFandom = nameFandom;
    }

    // Getter && Setter : fandomType
    public @NotNull String getFandomType() {
        return fandomType.getType();
    }

    public void setFandomType(FandomType fandomType) {
        this.fandomType = fandomType;
    }

    // Getter & Setter : dateRelease
    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }
}
