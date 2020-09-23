package com.zoro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zoro.products.domain.Comments;
import com.zoro.products.domain.Products;
import com.zoro.products.service.ProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 分页测试
     */
    @Test
    public void testPage(){
        QueryWrapper<Products> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("category" , 1).eq("sub_category","苹果");

        Page<Products> productsPage = new Page<>(1,20 , true);
        long start = System.currentTimeMillis();
        Page<Products> page = productsService.page(new Page<>(), queryWrapper);
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());

        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000);

        System.err.println(page.hasNext());
        System.err.println(page.hasPrevious());

    }

    /**
     * 自定义分页
     */
    @Test
    public void custPage(){

        Map<String, Object> hashMap = new HashMap<>(4);
        hashMap.put("category",'1');//450ms
        //hashMap.put("category",1);//类型转换 68710ms
        hashMap.put("sucategory","苹果");
        hashMap.put("current",20000);
        hashMap.put("pageSize",20);

        long start = System.currentTimeMillis();
        List<Products> productsList = productsService.selectPage(hashMap);
        long end = System.currentTimeMillis();
        System.out.println((end - start));
        for (int i = 0; i < productsList.size(); i++) {
            Products products = productsList.get(i);
            System.out.println(products.getId()+"\t"+products.getCategory()+"\t"+new String(products.getSubCategory())+"\t"+products.getCategorydesc());
        }

    }
}