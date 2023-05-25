package home.work.seven.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="s_name")
    private String name;

    @Column(name="age")
    private Integer age;
}
