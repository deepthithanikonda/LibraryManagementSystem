package libraryManagementSystem;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
         Library library = new Library();
        boolean start = true;

        while (start) {
        	Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: \n1.AddBook \n2.ShowBooks \n3.SearchBookById \n4.SearchBookByAuthor \n5.UpdateBookCostById \n6.RemoveBookById \n7.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                {
                    System.out.println("Enter Book Title: ");
                    String title = sc.next();
                    System.out.println("Enter Book Author: ");
                    String author = sc.next();
                    System.out.println("Enter Book Cost: ");
                    int cost = sc.nextInt();
                    System.out.println("Enter Number of Pages: ");
                    int pages = sc.nextInt();

                    library.addBook(new Book(title, author,  cost, pages));
                    
                }
                break;
                    

                case 2:{
                	try {
                		library.showBooks(); 
                	}
                	catch(NoBookFoundException e) {
                		System.out.println("No Books are added yet");
                		
                	}
                }
                    
                    break;

                case 3:{
                    System.out.print("Enter Book ID to search: ");
                    
                    while(true) {
                    	try {
                    	int searchBookId = sc.nextInt();
                        library.searchBookById(searchBookId); 
                        break;
                    	}
                    	catch(BookIdMisMatchException e) {
                    		System.out.println("re-enter valid book id");
                    		
                    	}
                    }
                }
                break;

                case 4:{
                	System.out.print("Enter Author name to search: ");
                	
                    while(true) {
                    	try {
                    		String searchAuthor = sc.next();
                            library.searchBookByAuthor(searchAuthor);
                        break;
                    	}
                    	catch(BookIdMisMatchException e) {
                    		System.out.println("re-enter valid book author");
                    		
                    	}
                    }
                }
                break;
                    

                case 5:{
                    System.out.println("Enter Book ID to update cost: ");
                    System.out.println("Enter new cost");
      
                    while(true) {
                    	try {
                    		int bookId = sc.nextInt();
                            int newCost = sc.nextInt();
                            library.updateBookCostById(bookId, newCost);
                            break;
                    	}
                    	catch(BookIdMisMatchException e) {
                    		System.out.println("re-enter valid book cost");
                    		
                    	}
                    }
                }
                break;
                    

                case 6:{
                    System.out.print("Enter Book ID to remove: ");
                    while(true) {
                    	try {
                    		int bookId = sc.nextInt();
                            library.removeBookById(bookId); 
                            break;
                    	}
                    	catch(BookIdMisMatchException e) {
                    		System.out.println("re-enter valid book author");
                    		
                    	}
                    }
                } 
                break;
                    

                case 7:{
                    System.out.println("Exiting... Thank you!");
                    start=false;
                }
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        }
    }
}

