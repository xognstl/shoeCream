package shoecream.controller.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shoecream.domain.User;
import shoecream.service.user.UserService;

import java.util.Map;

@RestController
@Slf4j
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping("/user/create")
    public Integer createUser(@PathVariable User vo){
        return service.create(vo);
    }
}
