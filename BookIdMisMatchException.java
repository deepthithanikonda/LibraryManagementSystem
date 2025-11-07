package libraryManagementSystem;

public class BookIdMisMatchException extends RuntimeException{
	@Override
	public String toString() {
		return getClass() +  "invalid book id exception ";
	}

}
