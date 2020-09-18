package com.ProductDetails.Product.Repository

import com.ProductDetails.Product.Entity.product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<product,Int> {
}