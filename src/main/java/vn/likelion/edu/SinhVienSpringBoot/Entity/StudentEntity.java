package vn.likelion.edu.SinhVienSpringBoot.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_student")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private int age;
}
