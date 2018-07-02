package com.wind.spring.Service;


import com.wind.spring.Model.ProductInfo;
import com.wind.spring.respository.ProductInfoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    /**
     * 获取商品信息By Id .
     */
    ProductInfo getProductInfoById(String id) {
        return productInfoRepository.findById(id).orElse(null);
    }

    /**
     * 获取所有商品.
     *
     * @return
     */
    public List<ProductInfo> getAllProductInfo() {
        return productInfoRepository.findAll();
    }

    /**
     * 新增一个商品.
     *
     * @param productInfo .
     * @return
     */
    public boolean addProductInfo(ProductInfo productInfo) {
        ProductInfo productInfo1 = productInfoRepository.save(productInfo);
        //BeanUtils.copyProperties(null,null);
        return productInfo1 != null;
    }

    /**
     * 删除商品信息ById .
     *
     * @param id .
     */
    public void delProductInfoById(String id) {
        productInfoRepository.deleteById(id);
    }
}
