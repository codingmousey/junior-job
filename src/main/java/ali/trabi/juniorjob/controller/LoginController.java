package ali.trabi.juniorjob.controller;

import ali.trabi.juniorjob.model.Login;
import ali.trabi.juniorjob.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "api/login")
public class LoginController {
    private final LoginRepository loginRepository;
    @Autowired
    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @GetMapping
    public List<Login> getLogins(){
        return loginRepository.findAll();
    }
}
