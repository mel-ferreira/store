package procart.store.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import procart.store.entities.User;
import procart.store.services.UserService;

import java.net.URI;
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
    @PostMapping
    public ResponseEntity<User> insertUsuario(@RequestBody User obj)
    {
        obj = userService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").
                buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);

    }

}
