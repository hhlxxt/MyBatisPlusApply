package com.zoro.products.mapper;

import com.zoro.products.domain.Products;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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

}
