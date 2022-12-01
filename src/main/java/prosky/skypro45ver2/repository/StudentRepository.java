package prosky.skypro45ver2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import prosky.skypro45ver2.model.Student;

import java.util.Collection;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findByAgeBetween(int min, int max);

    Collection<Student> findStudentByFaculty_Id(long id);

    @Query(value = "select count(*) from student", nativeQuery = true)
    Integer getAmountOfStudents();

    @Query(value = "select avg(age) from student", nativeQuery = true)
    Double getAverageAgeOfStudents();

    @Query(value = "select * from student order by id desc limit 5", nativeQuery = true)
    List<Student> getLastOfStudentsById();
}
