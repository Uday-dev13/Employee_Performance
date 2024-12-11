package Employee_Performance.Service;

import Employee_Performance.Entity.EmployeeReview;

public interface EmployeeReviewService {



    EmployeeReview saveEmployeeReview(EmployeeReview employeeReview);

    EmployeeReview getPerformanceSummary(Long employeeId);
}
