package procart.store.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import procart.store.entities.Category;
import procart.store.entities.Product;
import procart.store.services.CategoryService;
import procart.store.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductResources {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>>findAll()
    {
        List<Product> listaProdutos = productService.findAll();
        return ResponseEntity.ok().body(listaProdutos);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id)
    {
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
