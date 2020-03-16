package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Cart;


public interface CartRepository extends CrudRepository<Cart, Long>{

}
