package starter.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.cart.DoCart;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;
import starter.validation.OverviewData;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has an active account")
    public void pepito_has_an_active_account(String name) {
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                DoLogin.withCredentials("standard_user", "secret_sauce")
        );
    }

    @Then("he should add to cart")
    public void he_should_add_to_cart() {
        theActorCalled(name).attemptsTo(
                DoCart.addCart()
        );

        System.out.print("************" + OverviewData.value().answeredBy(theActorInTheSpotlight()));


    }




}
