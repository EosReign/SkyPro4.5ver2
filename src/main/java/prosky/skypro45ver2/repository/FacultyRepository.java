package prosky.skypro45ver2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prosky.skypro45ver2.model.Faculty;

import java.util.Collection;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findAllByNameIgnoreCase(String name);
    Collection<Faculty> findAllByColorIgnoreCase(String color);
}
