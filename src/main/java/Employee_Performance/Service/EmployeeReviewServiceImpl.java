package Employee_Performance.Service;


import Employee_Performance.Entity.EmployeeReview;
import Employee_Performance.Exception.DuplicateReviewException;
import Employee_Performance.Exception.EmployeeNotFound;
import Employee_Performance.Repository.EmployeeReviewRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeReviewServiceImpl implements EmployeeReviewService {

    @Autowired
    private EmployeeReviewRepository employeeReviewRepo;

    @Autowired
    private ModelMapper modelMapper;

    // Hardcoded weight of the manager - If needed we can change
    private static final double weight = 0.6;

    @Override
    public EmployeeReview saveEmployeeReview(EmployeeReview employeeReview) {
//        EmployeeReview review = employeeReviewRepo.findByEmployeeId(employeeReview.getEmployeeId())
//                .orElseThrow(()-> new DuplicateReviewException("Employee Id already exists!"));

       return employeeReviewRepo.save(employeeReview);

    }

    //Implementing performance summary method
    @Override
    public EmployeeReview getPerformanceSummary(Long employeeId) {
        EmployeeReview review = employeeReviewRepo.findByEmployeeId(employeeId)
                .orElseThrow(()-> new EmployeeNotFound("Employee with "+employeeId+" Not Found"));

        // Calculating self review length
        double selfReviewLengthScore = (review.getSelfReview().length())/ 100.0;
        System.out.println(selfReviewLengthScore); // Printing it to verify
        System.out.println(review.getSelfReview().length()); // Printing it to verify

        // Calculating derived performance score
        double derivedPerformanceScore = (selfReviewLengthScore +(review.getManagerRating()*weight))/2.0;
        System.out.println(derivedPerformanceScore);

        // Saving derived performance score to DB
        review.setDerivedPerformanceScore(derivedPerformanceScore);
        EmployeeReview employeeReview1 = employeeReviewRepo.save(review);

        return employeeReview1;

    }
}
