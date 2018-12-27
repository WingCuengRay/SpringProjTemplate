package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "dao.model")
public class DaoConfig {

    @Bean
    @Profile("dev")
    public DataSource testDataSource(){
//        EmbeddedDatabaseBuilder edb = new EmbeddedDatabaseBuilder();
//        edb.addScript("");
//        edb.addScript("");
//        EmbeddedDatabase embeddedDatabase = edb.build();
//        return embeddedDatabase;
        return null;
    }
}
