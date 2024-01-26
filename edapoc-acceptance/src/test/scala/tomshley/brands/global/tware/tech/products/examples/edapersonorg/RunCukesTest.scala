package tomshley.brands.global.tware.tech.products.examples.edapersonorg

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  //src/test/resources/features/person-to-org.feature
  features = Array("src/test/resources/features"),
  glue = Array(
    "tomshley.brands.global.tware.tech.products.examples.edapersonorg.steps"
  ),
  plugin = Array("pretty")
)
class RunCukesTest
