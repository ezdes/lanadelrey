package com.example.project.Service;
import com.example.project.Dto.UserRegistrationDto;
import com.example.project.Entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}