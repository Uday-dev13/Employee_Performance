package Employee_Performance.Exception;

public class DuplicateReviewException extends  RuntimeException{

    // Custom Exception Handling which extends Run Time Exception
    public DuplicateReviewException(String message){
        super(message);
    }
}
