package com.example.demo.controller;

import com.example.demo.dto.ProductResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ProductController {

    @GetMapping("/products")
    ResponseEntity<List<ProductResponseDto>> getAll(){
        List<ProductResponseDto> productList = new ArrayList<>();
        productList.add(new ProductResponseDto(1, "Java backend", 40, "https://cdn.codegym.vn/wp-content/uploads/2022/06/trang-chu-2-7.jpg"));
        productList.add(new ProductResponseDto(2, "ReactJS", 35, "https://cdn.codegym.vn/wp-content/uploads/2022/06/trang-chu-2-7.jpg"));
        productList.add(new ProductResponseDto(3, "Java fullstack", 60, "https://cdn.codegym.vn/wp-content/uploads/2022/06/trang-chu-2-7.jpg"));
        productList.add(new ProductResponseDto(4, "Java backend", 20, "https://cdn.codegym.vn/wp-content/uploads/2022/06/trang-chu-2-7.jpg"));

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
