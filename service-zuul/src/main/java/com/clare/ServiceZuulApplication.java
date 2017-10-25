package com.clare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}


/*
 * 依次运行这五个工程;打开浏览器访问：http://localhost:8769/api-a/hi?name=forezp ;浏览器显示：

hi forezp,i am from port:8762
打开浏览器访问：http://localhost:8769/api-b/hi?name=forezp ;浏览器显示：

hi forezp,i am from port:8762

http://192.168.66.121:8769/api-a/hi?name=forezp&token=13
http://192.168.66.121:8769/api-b/hi?name=forezp&token=13
 * */
}