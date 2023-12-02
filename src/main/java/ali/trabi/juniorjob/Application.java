package ali.trabi.juniorjob;

import ali.trabi.juniorjob.model.Login;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

/*	@GetMapping
	public String hello_world(){
		return "Hello world!";
	}*/

	@GetMapping
	public List<Login> temp(){
		return List.of(
				new Login(
						1, "testusername", "testpassword", LocalDateTime.now()
				)
		);
	}


}
