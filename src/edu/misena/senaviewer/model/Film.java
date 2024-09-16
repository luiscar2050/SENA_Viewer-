package edu.misena.senaviewer.model;

public class Film {
    static int id;
    static String title;
    static String gender;
    static String creator;
    static int duration;
    static short year;
    static boolean viewed;

    public Film(String title, String gender, String creator, int duration, short year){
        this.title = title;
        this.creator = creator;
        this.gender = gender;
        this.duration = duration;
        this.year = year;
    }

    public Film(String title, String gender, String creator, int duration){
        this.title = title;
        this.creator = creator;
        this.gender = gender;
        this.duration = duration;
    }

    public Film(String title, String gender, int duration){
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public static int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public static boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "publication{" +
                ", id=" + id +
                "title=" + title +
                ", id=" + gender +
                ", creator=" + creator +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                '}';
    }
}