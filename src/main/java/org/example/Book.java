package org.example;

public class Book {
    private  String title;
    private  String destription;
    private  String isbn;
    private  String writer;
    private double price;

    public Book(String title, double price, String writer, String destription, String isbn) {
        this.title = title;
        this.price = price;
        this.writer = writer;
        this.destription = destription;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
