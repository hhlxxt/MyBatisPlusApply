package com.zoro.products.mapper;

import com.zoro.products.domain.Products;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zoro
 * @since 2020-09-20
 */
@Mapper
public interface ProductsDao extends BaseMapper<Products> {

    @Select("select * from products   where category=#{category} and sub_category=#{sucategory} order by id desc limit #{current},#{pageSize}")
    List<Products> selectPage(Map<String , Object> map);
}
