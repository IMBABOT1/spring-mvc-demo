package ru.geekbrains.spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.geekbrains.spring.mvc.model.Product;
import ru.geekbrains.spring.mvc.repositories.ProductRepository;

import java.util.List;

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
}
