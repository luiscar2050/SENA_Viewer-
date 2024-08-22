package edu.misena.senaviewer.model;

import java.util.Date;

public class Book {
    int id;
    String title;
    Date editionDate;
    String editorial;
    String[] authors;

    int isbn;
    boolean readed;
    int timeReaded;

    public Book (String title,Date editionDate, String editorial, int isbn){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Date getEditionDate(){
        return editionDate;
    }

    public void setEditionDate(Date editionDate){
        this.editionDate = editionDate;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String[] getAuthors(){
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = authors;
        }
    }

    public int getIsbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public boolean getReaded(){
        return readed;
    }

    public void setReaded(boolean readed){
        this.readed = readed;
    }

    public int getTimeReaded(){
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded){
        this.timeReaded = timeReaded;
    }

}
