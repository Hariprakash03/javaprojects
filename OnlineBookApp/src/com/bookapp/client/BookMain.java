package com.bookapp.client;

import java.util.Scanner;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.*;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		IBookService bookService=new BookServiceImpl();
		//System.out.println(bookService.getAll());
		String author=scanner.nextLine();
		String category=scanner.nextLine();
		double amount=scanner.nextDouble();
		int bookId=scanner.nextInt();
		System.out.println("By author");
		try {
		bookService.getByAuthorContains(author).forEach(System.out::println);
		}catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("By author and category");
		try {
		bookService.getByAuthorContainsAndCategory(author, category).forEach(System.out::println);
		}catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("By category");
		try {
		bookService.getByCategory(category).forEach(System.out::println);
		}catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("By amount");
		try {
		bookService.getByPriceLessThan(amount).forEach(System.out::println);;
		}catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Book by id "+bookId);
			Book book=bookService.getById(bookId);
			System.out.println(book);
		scanner.close();
		
		

	}

}
