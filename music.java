package day5;

public class music{
    private String songName;
    private int duration;

    public music(String songName, int duration) {
        this.duration = duration;
        this.songName = songName;
    }

    public int getDuration() {
        return duration;
    }

    public String getSongName() {
        return songName;
    }

}
