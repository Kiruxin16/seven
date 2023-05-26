package home.work.seven.services;

import home.work.seven.converters.StudetnDtoConverter;
import home.work.seven.dto.StudentDto;
import home.work.seven.entities.Student;
import home.work.seven.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudetnDtoConverter converter;


    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream().map(converter::entityToDto).collect(Collectors.toList());
    }

    public void updateStudent (Long id, StudentDto dto){
        Student student = converter.dtoToEntity(dto);
        student.setId(id);
        studentRepository.save(student);
    }


    public Optional<StudentDto> getStudentById(Long id){
        return  studentRepository.findById(id).map(converter::entityToDto);
    }

    public void deleteStudentById (Long id){
        studentRepository.deleteById(id);
    }

    public void addStudent(StudentDto dto){
        studentRepository.save(converter.dtoToEntity(dto));
    }
}
