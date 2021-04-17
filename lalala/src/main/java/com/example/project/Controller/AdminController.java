package com.example.project.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class AdminController {
    @GetMapping("/admin")
    public String admin() {
        return "<h1>Welcome Admin</h1>";
    }
}
