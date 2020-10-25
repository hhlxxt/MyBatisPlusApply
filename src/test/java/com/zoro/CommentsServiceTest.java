package com.zoro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zoro.products.domain.Comments;
import com.zoro.products.domain.Products;
import com.zoro.products.service.CommentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentsServiceTest {

    @Autowired
    CommentsService commentsService ;

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
        List<Comments> comments = commentsService.customSelectPage(hashMap);
        long end = System.currentTimeMillis();
        System.out.println((end - start));
        for (int i = 0; i < comments.size(); i++) {
            Comments comment = comments.get(i);
            System.out.println(comment.getId()+"\t"+comment.getProductId()+"\t"+new String(comment.getIsGoodComment()));
        }

    }

}