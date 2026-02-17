package org.example;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(
                "Clean Code",
                35.99,
                "Robert C. Martin",
                "Guía para escribir código limpio y mantenible",
                "9780132350884"
        );

        Book book2 = new Book(
                "Effective Java",
                42.50,
                "Joshua Bloch",
                "Buenas prácticas y patrones en Java",
                "9780134685991"
        );

        Book book3 = new Book(
                "Design Patterns",
                50.00,
                "Erich Gamma",
                "Patrones de diseño orientados a objetos",
                "9780201633610"
        );

        Book book4 = new Book(
                "Refactoring",
                47.80,
                "Martin Fowler",
                "Mejora del diseño del código existente",
                "9780201485677"
        );

        Book book5 = new Book(
                "The Pragmatic Programmer",
                39.95,
                "Andrew Hunt",
                "Consejos prácticos para desarrolladores",
                "9780201616224"
        );
        System.out.println(book1.getTitle()+book1.getPrice()+", "+book1.getWriter()+", "+book1.getDestription()+", "
        +book1.getIsbn());
        System.out.println(book2.getTitle()+book2.getPrice()+", "+book2.getWriter()+", "+book2.getDestription()+", "
                +book2.getIsbn());
        System.out.println(book3.getTitle()+book3.getPrice()+", "+book3.getWriter()+", "+book3.getDestription()+", "
                +book3.getIsbn());
        System.out.println(book4.getTitle()+book4.getPrice()+", "+book4.getWriter()+", "+book4.getDestription()+", "
                +book4.getIsbn());
        System.out.println(book5.getTitle()+book5.getPrice()+", "+book1.getWriter()+", "+book5.getDestription()+", "
                +book5.getIsbn());

        book3.setTitle("changed");
        book3.setIsbn("changed");
        book3.setPrice(0.1);
        book3.setWriter("changed");
        book3.setDestription("changed");

        System.out.println(book3.getTitle()+book3.getPrice()+", "+book3.getWriter()+", "+book3.getDestription()+", "
                +book3.getIsbn());

    }
}