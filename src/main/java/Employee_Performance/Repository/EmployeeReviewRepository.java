package Employee_Performance.Repository;


import Employee_Performance.Entity.EmployeeReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Extends Jpa Repository to implement CRUD operations
public interface EmployeeReviewRepository extends JpaRepository<EmployeeReview, Long> {
    Optional<EmployeeReview> findByEmployeeId(Long employeeId);
}
