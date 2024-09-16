package edu.misena.senaviewer.model;

public class Publication {
    static String title;
    static String editionDate;
    static String editorial;
    static String[] authors;

    public Publication(String title, String editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = new String[0];
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public static String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = authors;
        }
    }

    @Override
    public String toString() {
        return "publication{" +
                "title=" + title +
                ", edition Date=" + editionDate +
                ", editorial=" + editorial +
                ", authors=" + authors +
                '}';
    }
}