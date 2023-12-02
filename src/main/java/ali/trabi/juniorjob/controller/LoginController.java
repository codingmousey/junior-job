package ali.trabi.juniorjob.controller;

import ali.trabi.juniorjob.model.Login;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "api/login")
public class LoginController {
    @GetMapping
    public List<Login> getLogins(){
        return List.of(
                new Login(
                        1, "testusername", "testpassword", LocalDateTime.now()
                )
        );
    }
}
