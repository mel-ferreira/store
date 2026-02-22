package procart.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import procart.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
