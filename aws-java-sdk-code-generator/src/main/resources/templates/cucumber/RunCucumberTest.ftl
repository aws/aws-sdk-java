${fileHeader}
package ${metadata.smokeTestsPackageName};

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(glue = {"com.amazonaws.smoketest"})
@RunWith(Cucumber.class)
public class RunCucumberTest {

}
