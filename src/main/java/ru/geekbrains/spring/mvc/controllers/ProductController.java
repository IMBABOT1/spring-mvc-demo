package ru.geekbrains.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
}
