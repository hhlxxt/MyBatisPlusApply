package com.zoro;

import com.zoro.products.domain.Products;
import com.zoro.products.service.ProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsServiceTest {

    @Autowired
    ProductsService productsService ;
    @Test
    public void saveProcucts(){
        Products entity  = new Products();
        entity.setCategory("5");
        entity.setSubCategory("奔驰");
        entity.setCategorydesc("车类型");
        Products products = productsService.getById(1);
        System.out.println(products);
        productsService.saveOrUpdate(entity);
    }

}