package delivery.common;


import delivery.FrontendApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FrontendApplication.class })
public class CucumberSpingConfiguration {
    
}
