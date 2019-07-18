package wcci.ecommercesite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private Long id;
	
	private String owner;
	
	public Cart() {
		
	}

	public Cart(String owner) {
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}
	
	public String getOwner() {
		return owner;
	}
}
