package com.storythings.sample.mybatisplus.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import com.storythings.sample.mybatisplus.config.prop.DataSourceProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Resource
    private DataSourceProperty properties;

    @Bean
    public DataSource createDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(properties.getDriverClassName());
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        return dataSource;
    }

}
