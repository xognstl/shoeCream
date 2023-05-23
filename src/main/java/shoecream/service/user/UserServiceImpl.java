package shoecream.service.user;

import org.springframework.stereotype.Service;
import shoecream.domain.User;
import shoecream.vo.UserVO;

import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Override
    public Map<String, User> create(UserVO vo) {
        return null;
    }
}
