package com.zoro.products.mapper;

import com.zoro.products.domain.Comments;
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
public interface CommentsDao extends BaseMapper<Comments> {

    @Select(" SELECT * FROM `comments` a ,(SELECT id FROM `comments` WHERE id>#{id} and  product_id =#{productId} AND is_good_comment =#{isGood} ORDER BY id   LIMIT #{pageSize} ) b WHERE a.`id` = b.id")
    List<Comments> selectPage(Map<String , Object> map);

    @Select("SELECT count(*) FROM `comments` WHERE  product_id =#{productId} AND is_good_comment =#{isGood}")
    Long count(Map<String , Object> map);
}
