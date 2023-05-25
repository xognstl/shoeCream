package shoecream.service.user;

import org.springframework.stereotype.Service;
import shoecream.domain.User;

@Service
public interface UserService {
    Integer create(User vo);
}
