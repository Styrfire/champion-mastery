package com.championMastery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.servlet.*;
import java.io.IOException;

@EnableAutoConfiguration
@SpringBootApplication
public class Server extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(Server.class);
	}

	public static void main(String[] args)
	{
		SpringApplication.run(Server.class, args);
	}
}
