package corp.home.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {

    @GetMapping("/")
    public String mainPage(){
        return "Main ok ___ " + new Date();
    }

    @GetMapping("/test")
    public String test(){
        return "Test ___ " + new Date();
    }
}
