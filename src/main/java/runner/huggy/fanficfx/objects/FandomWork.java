package runner.huggy.fanficfx.objects;

import org.w3c.dom.Text;
import runner.huggy.fanficfx.objects.enums.FandomStatus;

import java.util.Date;

public class FandomWork {
    private int idWork;
    private String nameWork;
    private Text summaryWork;
    private Date releaseDate;
    private Date modifiedDate;
    private FandomStatus status;

    /**
     * It creates a Work for a fanfiction.
     * @param idWork the ID of the Work
     * @param nameWork the name of the Work
     * @param releaseDate the Release date of the Work
     * @param summaryWork the summary of the work
     * @param modifiedDate the date where the work is modified
     * @param status the status of the work
     */
    public FandomWork(int idWork, String nameWork, Date releaseDate, Text summaryWork, Date modifiedDate, FandomStatus status) {
        this.idWork = idWork;
        this.nameWork = nameWork;
        this.releaseDate = releaseDate;
        this.summaryWork = summaryWork;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }

    public int getIdWork() {
        return idWork;
    }

    public void setIdWork(int idWork) {
        this.idWork = idWork;
    }

    public String getNameWork() {
        return nameWork;
    }

    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

    public Text getSummaryWork() {
        return summaryWork;
    }

    public void setSummaryWork(Text summaryWork) {
        this.summaryWork = summaryWork;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public FandomStatus getStatus() {
        return status;
    }

    public void setStatus(FandomStatus status) {
        this.status = status;
    }
}