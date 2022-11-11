package uz.bakhromjon.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 11/11/22, Fri, 21:40
 **/
@Component
public class DataWebServiceApiIndicator implements HealthIndicator {
    private final static String MESSAGE_KEY = "Data Web service API";
    @Override
    public Health health() {
        if (!isServiceUp()) {
            return Health.down().withDetail(MESSAGE_KEY, "Down").build();
        }
        return Health.up().withDetail(MESSAGE_KEY, "Up").build();
    }

    private boolean isServiceUp() {
        return true;
    }
}
