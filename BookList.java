/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();

    public BookList() {
        bookList.add(new TextBook("tttt", "Publisher A", new Date(), 50.9, 10.0, "new"));
        bookList.add(new ReferenceBook("tttt", "Publisher A", new Date(), 50.9, 10.0, 50.0));
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap sach add:  ");
        int type = scanner.nextInt();
        scanner.nextLine(); 

        Book newBook;
        if (type == 1) {
            newBook = new TextBook();
        } else {
            newBook = new ReferenceBook();
        }

        newBook.addBook();
        bookList.add(newBook);
    }

    public void updateBook(String id) {
        for (Book book : bookList) {
            if (book.bookId.equals(id)) {
                book.updateBook(id);
                return;
            }
        }
    }

    public void deleteBookById(String id) {
        bookList.removeIf((book) -> book.bookId.equals(id));
    }

    public Book findBookId(String id) {
        for (Book book : bookList) {
            if (book.bookId.equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayBook();
        }
    }
}
