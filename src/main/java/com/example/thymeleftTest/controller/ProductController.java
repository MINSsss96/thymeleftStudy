package com.example.thymeleftTest.controller;

import com.example.thymeleftTest.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("product")

public class ProductController {

    @GetMapping("/info")
    public String info(Model model){
        Product product = new Product();
        product.setName("콜라");
        product.setPrice(1000);
        product.setStock(10);

        product.setName("사이다");
        product.setPrice(1200);
        product.setStock(7);

        model.addAttribute("product", product);

        List<Product> productList = new ArrayList<>();
        Product cola = new Product("콜라", 1000, 10);
        Product cyder = new Product("사이다", 1200, 7);
        productList.add(cola);
        productList.add(cyder);
        model.addAttribute("list", productList);


        return "/product/info";
    }
}
