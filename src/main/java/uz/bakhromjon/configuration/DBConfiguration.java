package uz.bakhromjon.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 11/11/22, Fri, 20:33
 **/
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
