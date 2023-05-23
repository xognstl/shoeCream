package shoecream.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shoecream.domain.User;
import shoecream.service.UserService;
import shoecream.vo.UserVO;

import java.util.Map;

@RestController
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping("/user/create")
    public Map<String, User> createUser(UserVO vo){
        return service.create(vo);
    }
}
