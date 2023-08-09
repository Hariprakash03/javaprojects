package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {

	public static List<Book>showBooks(){
		return Arrays.asList(
	    new Book("Java in action","John","Tech",1,900.90),
		new Book("5 am club","Robin Sharma","Selfhelp",2,300),
		new Book("HTML for Dummies","Ben John","Tech",3,1900),
		new Book("Secret Seven","Enid ebm","Fiction",4,700),
		new Book("Seven habits","John Hooper","SelfHelp",5,800));
	}
}
