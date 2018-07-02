package com.wind.spring.Service;

import com.wind.spring.Model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductInfoServiceTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void getProductInfoById() {
        ProductInfo productInfo = productInfoService.getProductInfoById("f1fdc57e-b72b-4b2b-9301-11a85cacef54");
        Assert.assertEquals(productInfo.getProductId(),"f1fdc57e-b72b-4b2b-9301-11a85cacef54");
    }

    @Test
    @Transactional
    public void addProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        String guid = UUID.randomUUID().toString();
        productInfo.setProductId(guid);
        productInfo.setProductName("上汽大众");
        productInfo.setProductPrice("88888888");
        boolean result = productInfoService.addProductInfo(productInfo);
        Assert.assertEquals(result,true);
    }
}