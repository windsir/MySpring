package com.wind.spring.Controller;

import com.wind.spring.Model.ProductInfo;
import com.wind.spring.Service.ProductInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "商品",description = "商品actions")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("product/getAllProductInfo")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = ("获取商品列表"),httpMethod = "GET")
    public List<ProductInfo> getAllProductInfo() {
        final List<ProductInfo> allProductInfo = productInfoService.getAllProductInfo();
        return allProductInfo;
    }
}
