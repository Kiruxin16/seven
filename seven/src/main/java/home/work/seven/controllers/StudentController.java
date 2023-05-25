package home.work.seven.controllers;

import home.work.seven.dto.StudentDto;
import home.work.seven.entities.Student;
import home.work.seven.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping()
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/delete/{id}")
    public void deleteStudentById (@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
    }

    @PostMapping("/add")
    public  void addStudent(@RequestParam("name")String name,@RequestParam("age") int age){
        studentService.addStudent(new StudentDto(name,age));
    }


}
