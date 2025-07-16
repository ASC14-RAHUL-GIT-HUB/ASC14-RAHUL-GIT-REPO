package com.demo.lab3;

public class App {
    public static void main(String[] args) {
        Movie m1 = new Movie("F1", "Hamilton Productions");
        m1.setDirectedBy("Hamilton");
        m1.setDuration(120);
        m1.setYear(2025);
        m1.setCategory("Action");
        System.out.println(m1.showDetails());
        System.out.println("Movie ID: " + m1.getMovieId());

        SpecialMovie sm = new SpecialMovie("EpicBattle", "ABC Studios", "Dolby Atmos", "CGI VFX");
        System.out.println(sm.showSpecialDetails());

        InternationalMovie im = new InternationalMovie("Le Voyage", "Paris Films", "France", "French");
        im.setDirectedBy("Pierre Martin");
        im.setDuration(90);
        im.setYear(2024);
        im.setCategory("Drama");
        System.out.println(im.showInternationalDetails());

        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
}
