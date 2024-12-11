package Employee_Performance.Exception;

public class DuplicateReviewException extends  RuntimeException{
    public DuplicateReviewException(String message){
        super(message);
    }
}
