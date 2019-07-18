package wcci.ecommercesite.repositories;

import org.springframework.data.repository.CrudRepository;

import wcci.ecommercesite.entities.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

}
