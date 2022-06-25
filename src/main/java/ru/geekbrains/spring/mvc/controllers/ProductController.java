package ru.geekbrains.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring.mvc.model.Product;
import ru.geekbrains.spring.mvc.services.ProductService;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public String hello(Model model){
        List<Product> list = productService.getAllProducts();
        model.addAttribute("products", list);
        return "form";
    }
    @GetMapping("/add_product")
    public String addProduct(@ModelAttribute Product product){
        Product p = product;
        productService.addProduct(p);
        return "redirect:/products";
    }

    @GetMapping("/dell_product/{id}")
    public String deleteProductByID(@PathVariable Long id){
        productService.deleteProductByID(id);
        return "redirect:/products";
    }
}
