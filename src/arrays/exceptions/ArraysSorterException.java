package arrays.exceptions;

public class ArraysSorterException extends Exception{
    public ArraysSorterException(String message) {
        super(message);
    }

    public ArraysSorterException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArraysSorterException(Throwable cause) {
        super(cause);
    }
}
