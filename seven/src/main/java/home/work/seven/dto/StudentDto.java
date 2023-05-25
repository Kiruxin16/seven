package home.work.seven.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
public class StudentDto {
    private Long id;
    private String name;
    private Integer age;

    public StudentDto(){

    }

    public StudentDto(String name, int age){
        this.name=name;
        this.age=age;
    }

}
