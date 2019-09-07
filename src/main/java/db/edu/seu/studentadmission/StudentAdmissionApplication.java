package db.edu.seu.studentadmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StudentAdmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAdmissionApplication.class, args);
	}

}
