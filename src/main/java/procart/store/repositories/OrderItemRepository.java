package procart.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import procart.store.entities.Order;
import procart.store.entities.OrderItem;
import procart.store.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
