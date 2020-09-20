package com.zoro.products.service.impl;

import com.zoro.products.domain.Comments;
import com.zoro.products.mapper.CommentsDao;
import com.zoro.products.service.CommentsService;
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
public class CommentsServiceImpl extends ServiceImpl<CommentsDao, Comments> implements CommentsService {

    @Autowired
    CommentsDao commentsDao ;

    @Override
    public List<Comments> selectPage(Map<String, Object> map) {
        return commentsDao.selectPage(map);
    }

    @Override
    public Long count(Map<String, Object> map) {
        return commentsDao.count(map);
    }
}
