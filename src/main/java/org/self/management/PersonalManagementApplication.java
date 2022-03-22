package org.self.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("org.self.management.dao")
public class PersonalManagementApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PersonalManagementApplication.class, args);
        Object bean = run.getBean("RedisTemplate");
    }

}
