package Employee_Performance.Exception;

public class EmployeeNotFound extends RuntimeException{

    // Custom Exception Handling which extends Run Time Exception
    public EmployeeNotFound(String message) {
        super(message);
    }
}
