package procart.store.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import procart.store.entities.Category;
import procart.store.entities.Order;
import procart.store.services.CategoryService;
import procart.store.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoryResources {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>>findAll()
    {
        List<Category> listaCategorias = categoryService.findAll();
        return ResponseEntity.ok().body(listaCategorias);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id)
    {
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
