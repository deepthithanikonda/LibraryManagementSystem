package libraryManagementSystem;

import java.util.Random;

public class Book {
	private String bookTitle;
	private String bookAuthor;
	private int bookId;
	private int cost;
	private int noOfPages;
	
	public Book() {}
	Random r = new Random();

	public Book(String bookTitle, String bookAuthor, int cost, int noOfPages) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookId=r.nextInt(123456);
		this.cost = cost;
		this.noOfPages = noOfPages;
	}

	

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	


	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	


	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	public void display() {
		System.out.println("bookTitle: " + getBookTitle());
        System.out.println("bookauthor: " + getBookAuthor());
		System.out.println("bookid: " + getBookId());
		System.out.println("bookcost: " + getCost());
		System.out.println("bookPages: " + getNoOfPages());
	}
	

}
