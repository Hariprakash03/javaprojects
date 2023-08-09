package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book>book=BookDetails.showBooks();
		return book;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book>books=BookDetails.showBooks();
		List<Book>authors=(books.stream().filter(book->book.getAuthor().equals(author))).toList();
		if(authors.size()==0)
			throw new BookNotFoundException("No author found");
		else
			return authors;
		
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book>books=BookDetails.showBooks();
		List<Book>categorys=(books.stream().filter(book->book.getCategory().equals(category))).toList();
		if(categorys.size()==0) {
			throw new BookNotFoundException("Book not found for this category");
		}
		else
			return categorys;
		
		
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>prices=books.stream().filter(book->book.getPrice()<price).toList();
		
		if(prices.size()==0) {
			throw new BookNotFoundException("Book not found less than the mentioned price");
		}
		else
			return prices;
		
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String Category) throws BookNotFoundException {
		List<Book>books=BookDetails.showBooks();
		List<Book>authorCategory=books.stream().filter((book->book.getAuthor().equals(author)&&book.getCategory().equals(author))).toList();
		if(authorCategory.size()==0) {
			throw new BookNotFoundException("Book not found for the above mentioned author and size");
		}
		else
			return authorCategory;
		
	}
	public Book getById(int bookId)throws BookNotFoundException{
		List<Book>books=BookDetails.showBooks();
		return books.stream().filter(book->book.getBookId()==bookId).findFirst().orElseThrow(()->new BookNotFoundException("There is no book found with this id"));
	}

	

}
