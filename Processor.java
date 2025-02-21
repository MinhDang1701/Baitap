/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Book;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Processor {
    public static void main(String[] args) {
        BookList bookList=new BookList();
        Scanner scanner=new Scanner(System.in);
          while(true){
              System.out.println("menu");
            
              System.out.println(" 1them");
            System.out.println("2. update theo ID");
            System.out.println("3. delete theo ID");
            System.out.println("4. find theo ID");
            System.out.println("5. show");
            System.out.println("6. exist1");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                   
                    break;
                case 2:
                    System.out.print("nhap id update: ");
                    String id = scanner.nextLine();
                    bookList.updateBook(id);
                    break;
                case 3:
                    System.out.print("nhap id delete: ");
                    id = scanner.nextLine();
                    bookList.deleteBookById(id);
                    break;
                case 4:
                    System.out.print("nhap id find: ");
                    id = scanner.nextLine();
                    Book book = bookList.findBookId(id);
                    if (book != null) {
                        book.displayBook();
                    } else {
                        System.out.println("Kh tim thay .");
                    }
                    break;
                case 5:
                    bookList.displayAllBooks();
                    break;
                case 6:
                    System.out.println("ẽxist");
                    return;
                default:
                    System.out.println("nhap lai");
            }
        }
                
    }
}
