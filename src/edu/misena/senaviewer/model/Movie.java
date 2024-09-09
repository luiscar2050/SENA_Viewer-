package edu.misena.senaviewer.model;

public class Movie extends film {

    public Movie(int id, String title, String genre, String creator, int duration, String year, boolean viewed, int timeViewed) {
        super(id, title, genre, creator, duration, year, viewed);
    }

    private String creator;
    private int timeViewed;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

}


