package edu.mum.cs425.project.eshoppers.serviceImpl;

import edu.mum.cs425.project.eshoppers.domain.Cart;
import edu.mum.cs425.project.eshoppers.domain.Customer;
import edu.mum.cs425.project.eshoppers.domain.Product;
import edu.mum.cs425.project.eshoppers.repository.CartRepository;
import edu.mum.cs425.project.eshoppers.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
   @Autowired
  CartRepository cartRepository;


    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void delete(Long id) {
        cartRepository.deleteById(id);
    }


    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }



    @Override
    public List<Cart> findCartByCustomer_Cid(long id) {
        return cartRepository.findCartByCustomer_Cid(id);
    }

    @Override
    public Cart findCartById(Long id) {
        return cartRepository.findCartById(id);
    }


}
