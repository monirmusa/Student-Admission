package db.edu.seu.studentadmission;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    private long id;
    private String name;
    private String department;
     private long cgpa;
}
