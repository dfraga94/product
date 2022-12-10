package ec.edu.itsqmet.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.product.repository.IProductRepository;

@SpringBootTest
class ProductApplicationTests {
	@Autowired
	private IProductRepository productRepository;

	@Test
	void contextLoads() {
System.out.println(productRepository.count());
		
	}

}
