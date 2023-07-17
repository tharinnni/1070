

package pagecucumberpackagerunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "C:\\Users\\tharini.murugesan\\eclipse-workspace\\pagecucumber\\src\\test\\resources\\Features\\Day10.feature",
		glue={"pagecucumberpackage"},
		dryRun=false,
		monochrome = true)
		
public class runner {

}
