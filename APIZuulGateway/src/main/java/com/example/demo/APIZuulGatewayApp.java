package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2
public class APIZuulGatewayApp {
	
	private final ZuulProperties zuulProperties;
	
	public APIZuulGatewayApp(ZuulProperties zuulProperties) {
		this.zuulProperties = zuulProperties;
		}
	
	
	public static void main(String[] args) {
		SpringApplication.run(APIZuulGatewayApp.class, args);
	}
	
	@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResourcesProvider() {
	return () -> {
	List<SwaggerResource> resources = new ArrayList<>();
	zuulProperties.getRoutes()
	.values()
	.forEach(route -> resources.add(createSwaggerResource(route)));
	return resources;
	};
	}
	
	private SwaggerResource createSwaggerResource(ZuulRoute route) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(route.getServiceId());
		swaggerResource.setLocation("/" + route.getId() + "/v2/api-docs");
		swaggerResource.setSwaggerVersion("2.0");
		return swaggerResource;
		}
}
