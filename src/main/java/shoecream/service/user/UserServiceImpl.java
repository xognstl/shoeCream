package shoecream.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoecream.domain.User;
import shoecream.repo.UserRepository;

import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public Integer create(User vo) {

        return repository.save(vo);
    }
}
