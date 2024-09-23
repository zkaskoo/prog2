class Movie {
    public static int movieCounter = 0;
    private String title;
    private int year;
    private double score;

    public Movie(String title, int year, double score) {
        this.title = title;
        this.year = year;
        this.score = score;
        movieCounter += 1;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %.2f", this.title, this.year, this.score);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title.equals("")) {
            this.title = "Nem adtal meg cimet";
        } else {
            this.title = title;
        }
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double newScore) {
        this.score = newScore;
        if (newScore < 0) {
            this.score = 0.0;
        } else if (newScore > 10) {
            this.score = 10;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        
        Movie film = new Movie("Star Wars", 1988, 8.43223);

        System.out.println(film.getTitle());
        film.setTitle("");
        System.out.println(film.getTitle());

        System.out.println(film.movieCounter);
        
        System.out.println(film.getScore());
        film.setScore(123);
        System.out.println(film.getScore());
    }
}