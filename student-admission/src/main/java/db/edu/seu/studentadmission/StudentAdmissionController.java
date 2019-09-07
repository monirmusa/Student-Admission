package db.edu.seu.studentadmission;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentAdmissionController {


    @Autowired
    private StudentAdmissionRepository studentAdmissionRepository;

    public StudentAdmissionController() {
    }

    @GetMapping("/{id}")
    public Student getStudentByID(@PathVariable long id){
        return studentAdmissionRepository.findById(id).get();
    }


    @GetMapping("/findByName/{name}")
    public List<Student> getStudentByName(@PathVariable String name){
        return studentAdmissionRepository.findAllByName(name);
    }


    @GetMapping("")
    public List<Student> getAllStudents(){
        List<Student>studentList=new ArrayList<>();
        studentAdmissionRepository.findAll().forEach(studentList::add);
        return studentList;
    }


    @PostMapping("")
    public Student insertStudent(Student student){
       // Student student=new Student(id,name,department,cgpa);
        return studentAdmissionRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id){
        studentAdmissionRepository.deleteById(id);
    }


    @PutMapping("updatePerson/{id}")
    @ResponseBody
   public Student updateStudent(@PathVariable long id,@RequestBody Student student){
      return studentAdmissionRepository.save(student);
    }



}
