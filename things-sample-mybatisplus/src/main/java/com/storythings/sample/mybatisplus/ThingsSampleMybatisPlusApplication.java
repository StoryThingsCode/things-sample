package com.storythings.sample.mybatisplus;

import com.storythings.sample.common.bean.CustomBeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.storythings"}, nameGenerator = CustomBeanNameGenerator.class)
public class ThingsSampleMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThingsSampleMybatisPlusApplication.class, args);
    }

}
