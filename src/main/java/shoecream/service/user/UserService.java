package shoecream.service.user;

import org.springframework.stereotype.Service;
import shoecream.domain.User;
import shoecream.vo.UserVO;

import java.util.Map;

@Service
public interface UserService {
    Map<String, User> create(UserVO vo);
}
