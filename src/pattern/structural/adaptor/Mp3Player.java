package pattern.structural.adaptor;

public class Mp3Player implements MediaPlayer {
    // 기존 MediaPlayer 인터페이스 규격을 상속 받은 Mp3Player 의 플레이 기능이다
    // vlc 와 mp4 기능을 추가하려면 기존 Mp3Player 에 VLC 와 MP4 플레이어 객체가 생성되어 플레이 가능하도록 수정 되어야 한다
    // 하지만 Adpator 패턴을 사용하면 기능 추가 없이 어댑터에서 모든걸 처리하고 기존 플레이어는 어댑터만 연결하여 실행 가능하다

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equals("mp3")) {
            System.out.println(audioType + " playing (file name : " + fileName + ")");

        } else {
            Adaptor adaptor = new Adaptor(audioType);
            adaptor.play(audioType, fileName);
        }
    }


}
