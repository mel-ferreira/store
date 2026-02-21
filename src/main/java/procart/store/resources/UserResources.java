package procart.store.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import procart.store.entities.User;

@RestController
@RequestMapping("/usuarios")
public class UserResources {
    @GetMapping
    public ResponseEntity<User>findAll()
    {
        User usuario = new User(1L, "Melissa", "melissa@gmail.com", "11985462456", "159951");
        return ResponseEntity.ok().body(usuario);
    }
}
