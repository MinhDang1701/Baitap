/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Book;

import java.util.Date;

/**
 *
 * @author ThinkPad
 */
public class ReferenceBook extends Book {

    double tax;
 public ReferenceBook(){
        super();
    }
    public ReferenceBook(String bookId, String publisher, Date entryDate, Double unitPrice, Double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    @Override
    public void addBook() {
        System.out.println("add referenceBook: ");
    }

    @Override
    public void updateBook(String id) {
        System.out.println("update referenceBook: ");
    }

    @Override
    public void displayBook() {
        System.out.println("referenceBook ID : " + bookId);
        System.out.println("Publisher : " + publisher);
        System.out.println("Entry Date : " + entryDate);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity : " + quantity);
        System.out.println("tax : " + tax);

    }
}
