package libraryManagementSystem;

public class NoBookFoundException extends RuntimeException{

	@Override
	public String toString() {
		return getClass() + "No Books are added...noBookFoundException ";
	}
}
