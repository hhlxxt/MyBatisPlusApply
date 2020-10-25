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

   /**
    * 自定义分页
    *
    * 注意：自定义分页方法名不能和mybatisplus提供的分页方法重名否则会报如下异常
    * org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.binding.BindingException: Parameter 'category' not found. Available parameters are [ew, page, param1, param2]
    *
    *
    * @param map
    * @return
    */
   public List<Products> customSelectPage(Map<String , Object> map);
}
