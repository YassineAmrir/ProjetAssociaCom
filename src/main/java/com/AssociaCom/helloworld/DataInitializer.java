package com.AssociaCom.helloworld;

import com.AssociaCom.helloworld.dao.entity.UsersEntity;
import com.AssociaCom.helloworld.dao.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;




import java.util.Set;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public void run(String... args) throws Exception {
        // Create a single commune president account with manual username and password
        if (userRepository.findByUsername("communePresident").isEmpty()) {
            UsersEntity communePresident = new UsersEntity();
            communePresident.setUsername("communePresident");
            communePresident.setPassword(passwordEncoder.encode("communeStrongPassword"));
            communePresident.setRoles(Set.of("ROLE_COMMUNE_PRESIDENT"));
            userRepository.save(communePresident);
        }
    }
}

