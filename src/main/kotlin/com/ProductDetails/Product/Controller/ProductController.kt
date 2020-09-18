package com.ProductDetails.Product.Controller

import com.ProductDetails.Product.Entity.product
import com.ProductDetails.Product.Repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Product")
class ProductController (val productRepository: ProductRepository){

    @GetMapping("/productDetails")
    fun getProduct():List<product>{
        return productRepository.findAll()
    }
}