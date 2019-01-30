package co.com.bancolombia.certification.googlesuite.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {

	@Managed(driver = "chrome") //
	private WebDriver herBrowser;

	// Actor figura principal de screenplay

	// private Actor susan = new Actor("Susan");//Uso del patron Objet Builder
	private Actor susan = Actor.named("Susan");

	// no se hace uso del driver directamente, se hace uso del actor.
	@Before
	public void setUp() {

		// enlace del actor y driver
		susan.can(BrowseTheWeb.with(herBrowser));
	}

	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() {
		// Write code here that turns the phrase above into concrete actions
		// precondiciones

		// susan.wasAbleTo(Task);// en pasado fue capaz @given
		// susan.attemptsTo(tasks); // presente @when
		// OpenTheBrowser open = new OpenTheBrowser();
		// susan.wasAbleTo(new OpenTheBrowser()); utilizamos el patron objet
		// builder
		susan.wasAbleTo(OpenTheBrowser.on());
	
	}

	@When("^she  translates the word  cheese from  English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {
		// Write code here that turns the phrase above into concrete actions
		// condiciones
	}

	@Then("^she should see the word queso in the  screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() {
		// Write code here that turns the phrase above into concrete actions
		// consecuencias
	}

}
