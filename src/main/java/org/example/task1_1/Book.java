package org.example.task1_1;

public class Book implements Displayable {
    String name;
    String author;
    int year;

    //GET
    public String getName(String name) {
        return this.name;
    }

    public String getAuthor(String author) {
        return this.author;
    }

    public int getYear(int year) {
        return this.year;
    }

    //SET
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void display() {
        System.out.println("Название книги: " + this.name + "\nАвтор: " + this.author + "\nГод издания: " + this.year);
    }
}
