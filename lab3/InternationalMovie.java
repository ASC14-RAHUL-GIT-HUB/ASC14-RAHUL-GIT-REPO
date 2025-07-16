package com.demo.lab3;

public class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy, String country, String language) {
        super(movieName, producedBy);
        this.country = country;
        this.language = language;
    }

    public String showInternationalDetails() {
        return super.showDetails() +
                ", Country: " + country +
                ", Language: " + language;
    }
}

