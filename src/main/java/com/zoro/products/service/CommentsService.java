package com.zoro.products.service;

import com.zoro.products.domain.Comments;
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
public interface CommentsService extends IService<Comments> {

    List<Comments> customSelectPage(Map<String , Object> map);

    Long count(Map<String , Object> map);
}
