package by.bsuir.client.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Fene4ka_ on 05.04.2017.
 */
@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = {"by.bsuir.common.model"})
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

}
