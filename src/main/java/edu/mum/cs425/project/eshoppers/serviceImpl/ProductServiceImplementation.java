package edu.mum.cs425.project.eshoppers.serviceImpl;

import edu.mum.cs425.project.eshoppers.domain.Catalog;
import edu.mum.cs425.project.eshoppers.domain.Product;
import edu.mum.cs425.project.eshoppers.repository.ProductRepository;
import edu.mum.cs425.project.eshoppers.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CatalogServiceImpl catalogService;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

//  //  List<Product> findByCategoryLike(String category){
//        return productRepository.findByCategoryLike(category);
//    }
//
//    List<Product> findByProductNameLike(String name){
//        return productRepository.findByProductNameLike(name);
//    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findOne(Long id) {
        return productRepository.getOne(id);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findProductByCatalog(Catalog catalog) {
        return productRepository.findProductByCatalog(catalog);
    }
}
