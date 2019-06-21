package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka的服务端
public class PlatServiceApplication2000 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication2000.class,args);
    }
}
