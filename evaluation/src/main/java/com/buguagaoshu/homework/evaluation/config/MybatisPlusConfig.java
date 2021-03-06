package com.buguagaoshu.homework.evaluation.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pu Zhiwei {@literal puzhiweipuzhiwei@foxmail.com}
 * create          2020-06-03 23:15
 */
@Configuration
public class MybatisPlusConfig {
    /**
     * 引入分页插件
     * */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setOverflow(true);
        // 每页最大 100 条
        paginationInterceptor.setLimit(100);
        return paginationInterceptor;
    }
}
