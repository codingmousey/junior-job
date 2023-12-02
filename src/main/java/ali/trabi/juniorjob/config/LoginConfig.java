package ali.trabi.juniorjob.config;

import ali.trabi.juniorjob.model.Login;
import ali.trabi.juniorjob.repository.LoginRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class LoginConfig {
    @Bean
    CommandLineRunner commandLineRunner(LoginRepository repo){
        return args -> {

            Login tempOne = new Login("aRandomUsername", "aVeryBadRandomPw", LocalDateTime.now());
            Login tempTwo = new Login("aRandomUsernameV2", "anotherVeryStupidPassword", LocalDateTime.now());
            repo.saveAll(List.of(tempOne, tempTwo));
        };
    }
}
