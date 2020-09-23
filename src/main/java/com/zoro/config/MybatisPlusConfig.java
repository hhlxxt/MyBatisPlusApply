package com.zoro.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.zoro.products.mapper"})
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * 防止全表更新与删除插件: BlockAttackInnerInterceptor
     * 针对 update 和 delete 语句
     * @return
     */
    @Bean
    public BlockAttackInnerInterceptor BlockAttackInnerInterceptor(){
        return  new BlockAttackInnerInterceptor() ;
    }
}
