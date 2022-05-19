package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/login.feature",
        glue = "steps"
        //yaha main nai branch mai dalta hu

)
public class Runner_Smoke {
}
