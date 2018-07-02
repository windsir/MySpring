package com.wind.spring.respository;

import com.wind.spring.Model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void test() {
        ProductInfo productInfo = productInfoRepository.findById("f11e7e0c-f6f9-403c-80d2-49ad343fc8da")
                .orElse(null);
        Assert.assertEquals(productInfo.getProductId(),"f11e7e0c-f6f9-403c-80d2-49ad343fc8da");
    }
}