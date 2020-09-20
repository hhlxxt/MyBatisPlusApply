package com.zoro.products.service.impl;

import com.zoro.products.domain.Comments;
import com.zoro.products.mapper.CommentsDao;
import com.zoro.products.service.CommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zoro
 * @since 2020-09-20
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsDao, Comments> implements CommentsService {

}
