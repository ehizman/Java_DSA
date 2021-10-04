package turtleGraphics.exceptions;

public class TurtleException extends Exception{
    public TurtleException(String message) {
        super(message);
    }

    public TurtleException(String message, Throwable cause) {
        super(message, cause);
    }

    public TurtleException(Throwable cause) {
        super(cause);
    }
}
