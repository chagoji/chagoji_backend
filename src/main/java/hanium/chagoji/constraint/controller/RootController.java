package hanium.chagoji.constraint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/health")
    public String healthChecl(){
        return "I'm healthy!";
    }
}
