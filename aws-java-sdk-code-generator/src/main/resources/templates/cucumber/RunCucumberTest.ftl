${fileHeader}
package ${metadata.smokeTestsPackageName};

import javax.annotation.Generated;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(glue = {"com.amazonaws.smoketest"})
@RunWith(Cucumber.class)
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunCucumberTest {

}
