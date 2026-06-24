package runner.huggy.fanficfx.objects.enums;

public enum FandomType {
    MOVIE,
    VIDEO_GAME,
    TOYS,
    TV_SERIES,
    BOOK;

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    public String getType(){
        if (this == FandomType.MOVIE) {
            return "Movie";
        } else if (this == FandomType.VIDEO_GAME) {
            return "Video Game";
        } else if (this == FandomType.TOYS){
            return "Toys";
        } else if (this == FandomType.TV_SERIES){
            return "TV Series";
        } else if (this == FandomType.BOOK){
            return "Book";
        }
        return "";
    }
}
