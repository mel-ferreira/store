package procart.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import procart.store.entities.Category;
import procart.store.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
