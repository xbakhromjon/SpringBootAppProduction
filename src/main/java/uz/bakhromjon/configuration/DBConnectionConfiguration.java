package uz.bakhromjon.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 11/11/22, Fri, 20:40
 **/
@Configuration
@EnableConfigurationProperties(DBConfiguration.class)
public class DBConnectionConfiguration {
    private DBConfiguration dbConfiguration;


    public DBConnectionConfiguration(@Qualifier("DBConfiguration") DBConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }


    @Profile("dev")
    @Bean
    public String devDBConnection() {
        System.out.println("DB connection for DEV");
        return "DB connection for DEV";
    }


    @Profile("prod")
    @Bean
    public String prodDBConnection() {
        System.out.println("DB connection for PROD");
        return "DB connection for PROD";
    }


    @Profile("qa")
    @Bean
    public String qaDBConnection() {
        System.out.println("DB connection for QA");
        return "DB connection for QA";
    }

}

