package ru.geekbrains.spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.mvc.model.Product;
import ru.geekbrains.spring.mvc.repositories.ProductRepository;

import java.util.List;
@Component
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public List<Product> getAllProducts(){
        return repository.getAllProducts();
    }

    public Product getProductById(long id){
        return repository.getProductById(id);
    }

    public void addProduct(Product product){
        repository.addProduct(product);
    }

    public void deleteProductByID(Long id){
        repository.deleteProductByID(id);
    }

}
