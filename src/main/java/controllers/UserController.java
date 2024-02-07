package controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class UserController {
    @GetMapping
    public String home() {
        return "Hello, World!";
    }
}
