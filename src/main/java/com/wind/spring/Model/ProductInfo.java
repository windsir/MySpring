package com.wind.spring.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@DynamicUpdate
@DynamicInsert
@ApiModel(value = "商品信息")
public class ProductInfo {

    @Id
    @ApiModelProperty(name = "商品Id",example = "商品id")
    private String productId;

    @JsonProperty("name")
    @ApiModelProperty(name = "商品名称",example = "商品名称")
    private String productName;

    @JsonIgnore
    @ApiModelProperty(name = "商品价格",example = "商品价格")
    private String productPrice;
}
