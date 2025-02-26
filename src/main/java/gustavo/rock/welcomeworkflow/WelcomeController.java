package gustavo.rock.welcomeworkflow;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

@GetMapping("")
    public String getWelcomeSite(){
        return "welcome";
    }


}
