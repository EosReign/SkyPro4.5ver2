package prosky.skypro45ver2.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import prosky.skypro45ver2.model.Avatar;

import java.util.Optional;


@Repository
public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(long studentId);

}