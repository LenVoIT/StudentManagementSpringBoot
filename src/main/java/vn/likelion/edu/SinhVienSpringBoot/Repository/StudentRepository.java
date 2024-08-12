package vn.likelion.edu.SinhVienSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.likelion.edu.SinhVienSpringBoot.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
}
