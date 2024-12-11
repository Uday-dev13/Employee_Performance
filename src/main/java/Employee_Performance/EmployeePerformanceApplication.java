package Employee_Performance;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeePerformanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePerformanceApplication.class, args);
	}

	// Model mapper - To convert Dto to Entity and vice-versa
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
