package shoecream.controller.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shoecream.domain.User;
import shoecream.service.user.UserService;
import shoecream.vo.UserVO;

import java.util.Map;

@RestController
@Slf4j
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping("/user/create")
    public Map<String, User> createUser(UserVO vo){
        return service.create(vo);
    }
}
