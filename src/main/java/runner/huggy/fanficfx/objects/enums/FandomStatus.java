package runner.huggy.fanficfx.objects.enums;

public enum FandomStatus {
    WIP,
    COMPLETE,
    DRAFT;

    public String getStatus(){
        if (this == WIP){
            return "Work In Progress";
        } else if (this == COMPLETE){
            return "Complete";
        }
        return "Draft";
    }
}
