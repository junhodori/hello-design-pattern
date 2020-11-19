package pattern.structural.facade;

public class Facade {
    Movie movie;
    Popcorn popcorn;

    Facade(Movie movie, Popcorn popcorn) {
        this.movie = movie;
        this.popcorn = popcorn;
    }

    // 팝콘을 요리하는 과정과 영화를 보는 과정을 한번에 통합한다
    public void watching(String movie, String popcorn) {
        this.popcorn.flavor(popcorn);
        this.popcorn.cooking();

        this.movie.select(movie);
        this.movie.play();
        this.movie.watching(this.popcorn.end());
    }

    public void end() {
        System.out.println(this.movie.movie + " 영화 종료");
    }
}
