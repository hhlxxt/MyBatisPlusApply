package com.zoro.products.service.impl;

import com.zoro.products.domain.Comments;
import com.zoro.products.domain.Products;
import com.zoro.products.mapper.ProductsDao;
import com.zoro.products.service.ProductsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zoro
 * @since 2020-09-20
 */
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsDao, Products> implements ProductsService {

    @Autowired
    ProductsDao productsDao;

    @Override
    public List<Products> selectPage(Map<String , Object> map){
       return productsDao.selectPage(map);
    }
}
