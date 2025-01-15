package net.study.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**商品管理微服务的启动类*/

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("net.study")
public class ProductApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext =
                SpringApplication.run(ProductApplication.class, args);

    }

}
