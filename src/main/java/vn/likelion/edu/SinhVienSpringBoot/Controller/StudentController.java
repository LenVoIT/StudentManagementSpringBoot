package vn.likelion.edu.SinhVienSpringBoot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.likelion.edu.SinhVienSpringBoot.Entity.StudentEntity;
import vn.likelion.edu.SinhVienSpringBoot.Model.StudentDTO;
import vn.likelion.edu.SinhVienSpringBoot.Service.StudentService;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    private Iterable<StudentEntity> findAll(){
        return studentService.findAll();
    }

    @PostMapping
    private StudentEntity createStudent(@RequestBody StudentDTO studentDTO){
        StudentEntity student = StudentEntity
                .builder()
                .name(studentDTO.getName())
                .age(studentDTO.getAge())
                .build();
        return studentService.create(student);
    }
    @DeleteMapping("/delete/{id}")
    private void deleteBook(@PathVariable int id){
        studentService.remove(id);
        System.out.println("Delete succeeded");
    }
    @PutMapping("/{id}")
    private StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentDTO studentDTO){
        StudentEntity studentEntity = studentService.findById(id);
        studentEntity.setName(studentDTO.getName());
        studentEntity.setAge(studentDTO.getAge());
        return studentService.save(studentEntity);
    }
}
