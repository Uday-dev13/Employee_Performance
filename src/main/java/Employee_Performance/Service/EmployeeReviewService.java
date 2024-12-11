package Employee_Performance.Service;

import Employee_Performance.Entity.EmployeeReview;

public interface EmployeeReviewService {



    // Saving Employee
    EmployeeReview saveEmployeeReview(EmployeeReview employeeReview);

    // Get Employee performance using employeeID
    EmployeeReview getPerformanceSummary(Long employeeId);
}
