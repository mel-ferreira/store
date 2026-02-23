package procart.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import procart.store.entities.Category;
import procart.store.entities.Order;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
