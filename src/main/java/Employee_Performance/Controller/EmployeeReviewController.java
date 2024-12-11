package Employee_Performance.Controller;


import Employee_Performance.Entity.EmployeeReview;
import Employee_Performance.Service.EmployeeReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/performance")
public class EmployeeReviewController {

    @Autowired
    private EmployeeReviewService employeeReviewService;

    @PostMapping("/save")
    public ResponseEntity<EmployeeReview> save(@RequestBody EmployeeReview employeeReview) {
        return new ResponseEntity<>(employeeReviewService.saveEmployeeReview(employeeReview),HttpStatus.CREATED);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeReview> getPerformanceSummary(@PathVariable long employeeId) {
        return new ResponseEntity<>(employeeReviewService.getPerformanceSummary(employeeId), HttpStatus.OK);
    }


}
