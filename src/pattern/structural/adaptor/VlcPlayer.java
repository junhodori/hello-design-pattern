package pattern.structural.adaptor;

public class VlcPlayer implements AdvencedMediaPlayer {
    @Override
    public void playVlc(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            System.out.println(audioType + " playing (file name : " + fileName + " / 음질 업그레이드+)");
        }
    }

    @Override
    public void playMp4(String audioType, String fileName) {

    }
}
