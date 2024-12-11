package Employee_Performance.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class EmployeeReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long employeeId;

    @Column(columnDefinition = "TEXT")
    private String selfReview;

    @CreationTimestamp
    private LocalDateTime selfReviewTimestamp;

    @Column(columnDefinition = "TEXT")
    private String managerReview;

    private int managerRating;

    @CreationTimestamp
    private LocalDateTime managerReviewTimestamp;

    private double derivedPerformanceScore;

    // Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getSelfReview() {
        return selfReview;
    }

    public void setSelfReview(String selfReview) {
        this.selfReview = selfReview;
    }

    public LocalDateTime getSelfReviewTimestamp() {
        return selfReviewTimestamp;
    }

    public void setSelfReviewTimestamp(LocalDateTime selfReviewTimestamp) {
        this.selfReviewTimestamp = selfReviewTimestamp;
    }

    public String getManagerReview() {
        return managerReview;
    }

    public void setManagerReview(String managerReview) {
        this.managerReview = managerReview;
    }

    public int getManagerRating() {
        return managerRating;
    }

    public void setManagerRating(int managerRating) {
        this.managerRating = managerRating;
    }

    public LocalDateTime getManagerReviewTimestamp() {
        return managerReviewTimestamp;
    }

    public void setManagerReviewTimestamp(LocalDateTime managerReviewTimestamp) {
        this.managerReviewTimestamp = managerReviewTimestamp;
    }

    public double getDerivedPerformanceScore() {
        return derivedPerformanceScore;
    }

    public void setDerivedPerformanceScore(double derivedPerformanceScore) {
        this.derivedPerformanceScore = derivedPerformanceScore;
    }
}
