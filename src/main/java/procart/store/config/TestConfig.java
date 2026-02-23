package procart.store.config;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import procart.store.entities.Category;
import procart.store.entities.Order;
import procart.store.entities.Product;
import procart.store.entities.User;
import procart.store.entities.enums.OrderStatus;
import procart.store.repositories.CategoryRepository;
import procart.store.repositories.OrderRepository;
import procart.store.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String @NonNull ... args) {
        User usuario1 = new User(null, "Maria", "maria@gmail.com", "11986456632", "147258");
        User usuario2 = new User(null, "Ramon", "ramon@gmail.com", "11978956321", "258147");

        Order pedido1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAGO,  usuario1);
        Order pedido2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.AGUARDANDO_PAGAMENTO, usuario2);
        Order pedido3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.AGUARDANDO_PAGAMENTO, usuario1);

        userRepository.saveAll(Arrays.asList(usuario1,usuario2));
        orderRepository.saveAll(Arrays.asList(pedido1,pedido2,pedido3));

        Category cat1 = new Category(null, "Eletrônicos");
        Category cat2 = new Category(null, "Livros");
        Category cat3 = new Category(null, "Computadores");

        Product prod1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product prod2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product prod3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product prod4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product prod5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(prod1,prod2,prod3,prod4,prod5));

    }
}
