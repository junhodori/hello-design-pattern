package pattern.structural.facade;

public class Movie {
    String movie;

    public void play() {
        System.out.println(this.movie + " 영화 재생");
    }

    public void watching(String popcorn) {
        System.out.println(popcorn + " 먹으면서 " + this.movie + " 영화 시청");
    }

    public void select(String move) {
        this.movie = move;
    }

    public void end() {
        System.out.println(this.movie + " 영화 종료");
    }
}
