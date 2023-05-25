package shoecream.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import shoecream.domain.User;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findOne(Long id);
    Integer save(User user);
}
