//package com.klef;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
//@SpringBootApplication
//public class SpringBootDemoProjectApplication extends SpringBootServletIntitializer{
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootDemoProjectApplication.class, args);
//		System.out.println("Hello Jenkins DevOps");
//	}
//
//}

package com.klef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDemoProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoProjectApplication.class, args);
        System.out.println("Hello Jenkins DevOps");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDemoProjectApplication.class);
    }
}
