package com.zoro.products.service;

import com.zoro.products.domain.Products;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zoro
 * @since 2020-09-20
 */
public interface ProductsService extends IService<Products> {

   public List<Products> selectPage(Map<String , Object> map);
}
