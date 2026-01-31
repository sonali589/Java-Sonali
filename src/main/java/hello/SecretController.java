import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

     
    private final String githubToken = System.getenv("GITHUB_TOKEN");

}

