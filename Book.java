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
public abstract class Book implements IBook {

    String bookId;
    String publisher;
    Date entryDate;
    Double unitPrice;
    Double quantity;
public Book(){
    
}
    public  Book 

        (String bookId,String publisher, Date entryDate, Double unitPrice,Double quantity){
     
        this.bookId  = bookId;
         
        this.publisher  = publisher;
         
        this.entryDate  = entryDate;
         
        this.bookId  = bookId;
    }
        @Override
        public abstract void addBook();
         @Override
        public abstract void updateBook(String id);
        @Override
        public abstract void displayBook();
        }

