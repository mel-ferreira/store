package procart.store.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import procart.store.entities.User;
import procart.store.repositories.UserRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User usuario1 = new User(null, "Maria", "maria@gmail.com", "11986456632", "147258");
        User usuario2 = new User(null, "Ramon", "ramon@gmail.com", "11978956321", "258147");

        userRepository.saveAll(Arrays.asList(usuario1,usuario2));
    }
}
