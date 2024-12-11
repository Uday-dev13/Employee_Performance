package Employee_Performance.Exception;

public class EmployeeNotFound extends RuntimeException{
    public EmployeeNotFound(String message) {
        super(message);
    }
}
