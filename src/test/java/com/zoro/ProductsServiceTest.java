package com.zoro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zoro.products.domain.Comments;
import com.zoro.products.domain.Products;
import com.zoro.products.service.CommentsService;
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

    @Autowired
    CommentsService commentsService ;

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
        hashMap.put("productId",1);
        hashMap.put("isGood","test");
        hashMap.put("id",1000000);
        hashMap.put("pageSize",20);

        long start = System.currentTimeMillis();
        List<Comments> comments = commentsService.selectPage(hashMap);
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000);
        for (int i = 0; i < comments.size(); i++) {
            Comments comment = comments.get(i);
            System.out.println(comment.getId()+"\t"+comment.getProductId()+"\t"+new String(comment.getIsGoodComment()));
        }

    }

}