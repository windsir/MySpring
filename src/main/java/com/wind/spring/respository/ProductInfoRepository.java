package com.wind.spring.respository;

import com.wind.spring.Model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

}
