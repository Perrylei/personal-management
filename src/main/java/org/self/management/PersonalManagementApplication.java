package org.self.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.self.management.dao")
public class PersonalManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalManagementApplication.class, args);
    }

}
