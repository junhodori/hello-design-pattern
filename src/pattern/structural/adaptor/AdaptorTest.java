package pattern.structural.adaptor;

public class AdaptorTest {
    public static void main(String[] args) {
        // MediaPlayer 인터페이스 규격에 맞게 개발된 mp3Player 는 mp3 형식만 지원한다
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.play("mp3", "melon100.mp3");

        // 하지만 새로운 요구 사항에 의해 AdvencedMediaPlayer 인터페이스 규격의 VLC 와 MP4 형식까지 지원해야 한다
        // 여기서 어댑터 패턴을 이용하면 기존 플레이어는 변경없이 새로운 기능 사용이 가능하다
        mp3Player.play("vlc", "bugs500.mp3");
        mp3Player.play("mp4", "youtube300.mp3");
    }
}
