package procart.store.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import procart.store.entities.User;
import procart.store.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserResources {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>>findAll()
    {
        List<User> listaUsuarios = userService.findAll();
        return ResponseEntity.ok().body(listaUsuarios);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id)
    {
        User obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
