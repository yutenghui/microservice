package org.bchd.im.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

/**
 * @Author: yth
 * @Date: 2019-06-12 15:18
 * @Version 1.0
 * @Description
 */
@Configuration
public class MybatisPlusConfiguration {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        Properties properties = new Properties();
        properties.setProperty("format", "false");
        performanceInterceptor.setProperties(properties);
        return performanceInterceptor;
    }
}
