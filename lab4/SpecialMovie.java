package com.demo.lab4;

public class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy, String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    public String showSpecialDetails() {
        return super.showDetails() +
                ", Sound Effects: " + soundEffectsTechnology +
                ", Visual Effects: " + visualEffectsTechnology;
    }
}

