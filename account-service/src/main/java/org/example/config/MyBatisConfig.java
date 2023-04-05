package org.example.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhang
 * @version V1.0
 */
@Configuration
@MapperScan({"org.example.dao"})
public class MyBatisConfig {
}
