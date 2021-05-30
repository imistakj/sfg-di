package guru.springframework.sfgdi.configuration;

import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
// this pattern we use when we don't own code or using jars.

   /* @Bean
    //@Value("${guru.username}, ${guru.password}, ${guru.jdbcurl}")
   FakeDataSource fakeDataSource(@Value("${guru.username}") String username
                                   ,@Value("${guru.password}") String password,
                                 @Value("${guru.jdbcurl}") String jdbcurl) {

       FakeDataSource fakeDataSource = new FakeDataSource();
       fakeDataSource.setUsername(username);
       fakeDataSource.setPassword(password);
       fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
   }*/
    @Bean
    FakeDataSource fakeDataSource(DataSourceConfig dataSourceConfig) {

        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(dataSourceConfig.getUsername());
        fakeDataSource.setPassword(dataSourceConfig.getPassword());
        fakeDataSource.setJdbcurl(dataSourceConfig.getJdbcurl());
      return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPatService("dog");
    }
    @Profile({"cat","default"})
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPatService("cat");
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
}
