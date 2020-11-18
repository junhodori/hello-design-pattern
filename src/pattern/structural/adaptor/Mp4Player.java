package pattern.structural.adaptor;

public class Mp4Player implements AdvencedMediaPlayer {
    @Override
    public void playVlc(String audioType, String fileName) {

    }

    @Override
    public void playMp4(String audioType, String fileName) {
        if (audioType.equals("mp4")) {
            System.out.println(audioType + " playing (file name : " + fileName + " / 음질 업그레이드+++)");
        }
    }
}
