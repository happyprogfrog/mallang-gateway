package me.progfrog.mallang_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MallangGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallangGatewayApplication.class, args);
	}

}
