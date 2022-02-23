package it.vscalcione.springboot.demoapplication.config;

<<<<<<< HEAD
import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
>>>>>>> bc1cbe5d71a72bee2ed9f915f6c9d4b6bed699dd
public class SwaggerConfig {

    @Bean
    public Docket api() {
<<<<<<< HEAD
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
                .paths((Predicate<String>) PathSelectors.any())
                .build();
    }
=======
        return new Docket(DocumentationType.SWAGGER_2);
    }


>>>>>>> bc1cbe5d71a72bee2ed9f915f6c9d4b6bed699dd
}
