package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private ArrayList<Book> book = new ArrayList<Book>();
	private Book b;
	
	//add book
	public void addBook(Book b) {
		book.add(b);
		System.out.println(b.getBookTitle()+ " is added sucessfully");
	}
	
	//show book
	public void showBooks() {
	    if (book.isEmpty()) {
	       //System.out.println("Books are not added yet. Please add books to view.");
	       throw new NoBookFoundException();
	    } else {
	        for (Book b : book) {
	            b.display(); 
	            System.out.println("-------------------------"); 
	        }
	    }
	}

	
	//search book by id
	public void searchBookById(int id) {
		Boolean isFound=false;
		if(book.isEmpty()) {
			//System.out.println("books are not added yet... please add books to search");
			throw new NoBookFoundException();
		}
		else {
			for(Book b : book) {
				if(b.getBookId()==id) {
					System.out.println(b.getBookTitle()+ " is found");
					isFound=true;
				}
			}
		}
		if(isFound==false) {
			//System.out.println("invalid id... book not found");
			throw new BookIdMisMatchException();
		}
	}
	
	
	//search book by Author
	public void searchBookByAuthor(String author) {
		Boolean isFound=false;
		if(book.isEmpty()) {
			//System.out.println("books are not added yet... please add books to search");
			throw new NoBookFoundException();
		}
		else {
			for(Book b : book) {
				if(b.getBookAuthor().equalsIgnoreCase(author)) {
					System.out.println(b.getBookAuthor()+ " is found");
					isFound=true;
				}
			}
		}
		if(isFound==false) {
			//System.out.println("invalid Author name... book not found");
			throw new BookIdMisMatchException();
		}
	}
	
	
	//update book cost by id
	
	public void updateBookCostById(int id , int newCost) {
		Boolean isFound=false;
		if(book.isEmpty()) {
			//System.out.println("books are not added yet....");
			throw new NoBookFoundException();
		}
		else {
			for(Book b : book) {
			    if(b.getBookId() == id) {
			        b.setCost(newCost);
			        System.out.println("Updated cost is: " + b.getCost());
			        isFound = true;
			    }
			}
        }
		if(isFound==false) {
			//System.out.println("invalid book id...");
			throw new BookIdMisMatchException();
		}
	}
	
	//remove book by id
	
		public void removeBookById(int id) {
		    boolean isFound = false;
		    if(book.isEmpty()) {
				//System.out.println("books are not added yet....");
		    	throw new NoBookFoundException();
			}
		    else {
		    	Iterator<Book> itr = book.iterator();
		    	while(itr.hasNext()) {
		    		Book b= itr.next();
		    		if(b.getBookId()==id)
		    		{
		    			itr.remove();
		    			System.out.println("Book is removed successfully");
		    			isFound=true;
		    		}
		    		
		    	}
		    	
		    }
		    if(isFound==false) {
				//System.out.println("invalid book id...");
		    	throw new BookIdMisMatchException();
			}
		}
     }