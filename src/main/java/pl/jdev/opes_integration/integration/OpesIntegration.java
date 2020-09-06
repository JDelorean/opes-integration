package pl.jdev.opes_integration.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@PropertySource(value = {"classpath:application.properties"})
@ImportResource("integration-context.xml")
public class OpesIntegration extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(OpesIntegration.class, args);
    }

}
