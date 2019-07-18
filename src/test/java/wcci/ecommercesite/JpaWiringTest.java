package wcci.ecommercesite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import wcci.ecommercesite.entities.Cart;
import wcci.ecommercesite.repositories.CartRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaWiringTest {
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private CartRepository cartRepo;
	
	private Cart cart1;
	
	@Before
	public void setUp() {
		cart1 = new Cart("Andrew's Cart");
		cartRepo.save(cart1);
		entityManager.flush();
		entityManager.clear();
	}
	
	@Test
	public void shouldStartJpaTestFrameWork() {
		
	}
	
	@Test
	public void shouldSaveAndLoadCart() {
		Cart foundCart = cartRepo.findById(cart1.getId()).get();
		assertThat(foundCart.getOwner(), is("Andrew's Cart"));
	}
}

