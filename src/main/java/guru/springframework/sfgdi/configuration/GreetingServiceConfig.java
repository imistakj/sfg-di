package guru.springframework.sfgdi.configuration;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {
// this pattern we use when we don't own code or using jars.
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
}
