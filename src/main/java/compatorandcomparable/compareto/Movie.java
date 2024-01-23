package compatorandcomparable.compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2000, 8.5, 50.0, 120.0));
        movies.add(new Movie(2010, 7.8, 80.0, 150.0));
        movies.add(new Movie(1995, 9.0, 30.0, 100.0));

        // Sort movies by rating
        Collections.sort(movies, Comparator.comparingDouble(Movie::getRating));

        System.out.println("Movies sorted by rating:");
        for (Movie movie : movies) {
            System.out.println("Year: " + movie.getYearReleased() +
                    ", Rating: " + movie.getRating());
        }

        // Sort movies by profit
        Collections.sort(movies, Comparator.comparingDouble(movie ->
                movie.getCollectionAmount() - movie.getBudget()));

        System.out.println("\nMovies sorted by profit:");
        for (Movie movie : movies) {
            double profit = movie.getCollectionAmount() - movie.getBudget();
            System.out.println("Year: " + movie.getYearReleased() +
                    ", Profit: " + profit);
        }
    }
}
