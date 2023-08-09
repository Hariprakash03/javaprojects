package com.lumen.objbasics;

public class Book {
	String author;
	double price;
	String category;
	Book(String author,double price,String category){
		this.author=author;
		this.price=price;
		this.category=category;
	}
	void getDetails() {
		System.out.println("Author "+author);
		System.out.println("Price "+price);
		System.out.println("Category "+category);
	}
	void checkBookType() {
		if(price>500)
			System.out.println("Premium book");
		else
			System.out.println("Standard book");
	}
}

