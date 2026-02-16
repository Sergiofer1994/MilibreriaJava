package org.example;

public class Book {
    private  String title, destription, isbn, writer;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setDestription(String destription) {
        this.destription = destription;
    }

    public String getDestription() {
        return destription;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
