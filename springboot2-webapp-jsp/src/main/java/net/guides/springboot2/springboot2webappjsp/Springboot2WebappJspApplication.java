package net.guides.springboot2.springboot2webappjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Collections;

@SpringBootApplication
public class Springboot2WebappJspApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Springboot2WebappJspApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Springboot2WebappJspApplication.class);
    app.setDefaultProperties(
        Collections.singletonMap("server.servlet.context-path", "/springboot2webapp"));
    app.run(args);
  }
}
