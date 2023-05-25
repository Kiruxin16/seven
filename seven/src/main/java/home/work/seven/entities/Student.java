package home.work.seven.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="products")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;
}
