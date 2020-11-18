package pattern.structural.adaptor;

public class Adaptor implements MediaPlayer {
    // 추가 요구사항으로 들어온 AdvencedMediaPlayer 인터페이스 규격을 구현하는 부분은 어댑터안에서 모두 처리한다
    // 그리고 기존 MediaPlayer 인터페이스 규격의 플레이 기능에 통합한다
    AdvencedMediaPlayer advencedMediaPlayer;

    // 오디오 타입을 확인해서 VLC 와 MP4 플레이어를 생성한다
    public Adaptor(String audioType) {
        if (audioType.equals("vlc")) {
            advencedMediaPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advencedMediaPlayer = new Mp4Player();
        }
    }

    // 기존 MediaPlayer 인터페이스 규격의 플레이 기능에 통합한다
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            advencedMediaPlayer.playVlc(audioType, fileName);
        } else if (audioType.equals("mp4")) {
            advencedMediaPlayer.playMp4(audioType, fileName);
        }
    }
}
