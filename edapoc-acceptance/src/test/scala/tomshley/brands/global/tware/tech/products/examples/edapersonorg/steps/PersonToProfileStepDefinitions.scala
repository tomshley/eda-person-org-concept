package tomshley.brands.global.tware.tech.products.examples.edapersonorg.steps

import tomshley.brands.global.tware.tech.products.examples.edapersonorg.value.profile.core.models.*
import io.cucumber.scala.{EN, ScalaDsl}

import java.util.UUID

class PersonToProfileStepDefinitions extends ScalaDsl with EN {
  Given("""a user with a global login Tom""") { () =>
    // Write code here that turns the phrase above into concrete actions
    val profileModel = ProfileModel(UUID.randomUUID(), "Tom")
    println(profileModel.personUUID.toString)
    throw new io.cucumber.scala.PendingException()
  }
  When("""user requests their profile data""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }
  When("""a legacy person entity UUID is matched""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }
  Then("""the user name from legacy person entity will be in the data""") {
    () =>
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.scala.PendingException()
  }
}
