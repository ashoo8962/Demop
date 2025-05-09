package interfaceassign.com.traning.quest4;

public class VLCMediaPlayer implements IMesiaPlayer{
    @Override
    public void PlayMusic() {
        System.out.println("Play mkv files");
    }

    @Override
    public void downloadMusic() {
        System.out.println("dwnld files mp3");
    }
}
