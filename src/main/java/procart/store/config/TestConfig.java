package procart.store.config;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import procart.store.entities.Order;
import procart.store.entities.User;
import procart.store.entities.enums.OrderStatus;
import procart.store.repositories.OrderRepository;
import procart.store.repositories.UserRepository;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String @NonNull ... args) {
        User usuario1 = new User(null, "Maria", "maria@gmail.com", "11986456632", "147258");
        User usuario2 = new User(null, "Ramon", "ramon@gmail.com", "11978956321", "258147");

        Order pedido1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAGO,  usuario1);
        Order pedido2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.AGUARDANDO_PAGAMENTO, usuario2);
        Order pedido3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.AGUARDANDO_PAGAMENTO, usuario1);

        userRepository.saveAll(Arrays.asList(usuario1,usuario2));
        orderRepository.saveAll(Arrays.asList(pedido1,pedido2,pedido3));
    }
}
