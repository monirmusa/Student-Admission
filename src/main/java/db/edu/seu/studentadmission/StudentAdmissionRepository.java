package db.edu.seu.studentadmission;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentAdmissionRepository extends CrudRepository<Student,Long> {
   List<Student>findAllByName(String name);

}
