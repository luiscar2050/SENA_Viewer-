package edu.misena.senaviewer.model;

public class film {
    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private String year;
    private boolean viewed;

    public film(int id, String title, String genre, String creator, int duration, String year, boolean viewed) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}
