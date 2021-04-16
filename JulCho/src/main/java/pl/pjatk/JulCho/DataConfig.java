package pl.pjatk.JulCho;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public MySimplePojo mySimplePojo()
    {
        return new MySimplePojo("some value");
    }

    @Bean
    public List<String> defaultData()
    {
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    public List<String> otherDefaultData()
    {
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    public String testPropertyValue()
    {
        return "Welcome from testPropertyValue";
    }
}
