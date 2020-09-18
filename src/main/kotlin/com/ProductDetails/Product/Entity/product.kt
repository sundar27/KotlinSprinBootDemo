package com.ProductDetails.Product.Entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "product")
data class product(

      @Id
      @Column(name = "ProductId")
      var productId : Int = 0,

      @Column(name = "ProductName")
      var productName : String = "" ,

      @Column(name = "ProductDescription")
      var productDescription : String = "",

      @Column(name = "Category")
      var category : String = "",

      @Column(name = "ValidFrom")
      var validFrom : Date ,

      @Column(name = "ValidTo")
      var validTo : Date  ,

      @Column(name = "Quantity")
      var quantity : Int = 0
)