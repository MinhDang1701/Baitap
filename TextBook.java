/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Book;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class TextBook extends Book {
    String status;
    public TextBook(){
        
    }
    public TextBook(String bookId,
            String publisher, Date entryDate,
            Double unitPrice,Double quantity, String status){
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status=status;
}
    @Override
    public void updateBook(String id){
        System.out.println("Update..... ");
    }
     @Override
    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sách: ");
        bookId = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        publisher = scanner.nextLine();
        entryDate = new Date(); 
        System.out.print("Nhập đơn giá: ");
        unitPrice = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        quantity = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nhập trạng thái sách: ");
        status = scanner.nextLine();
    }
     @Override
    public void displayBook(){
        System.out.println("text book id: "+bookId);
        System.out.println("Publisher: : "+publisher);
        System.out.println("Entry date: "+entryDate);
        System.out.println("Unit Price:  "+unitPrice);
        System.out.println("Quantity: "+quantity);
        System.out.println("Status: "+status);
    }
}