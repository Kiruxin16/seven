package home.work.seven.converters;


import home.work.seven.dto.StudentDto;
import home.work.seven.entities.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudetnDtoConverter {

    public StudentDto entityToDto(Student student){
        StudentDto studentDto =new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge());
        return studentDto;
    }

    public Student dtoToEntity(StudentDto dto){
        Student student= new Student();
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        return student;
    }
}
