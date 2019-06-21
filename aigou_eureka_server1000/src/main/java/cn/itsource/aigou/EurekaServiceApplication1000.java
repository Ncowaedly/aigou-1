package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //eureka的服务端
public class EurekaServiceApplication1000 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication1000.class,args);
    }
}
