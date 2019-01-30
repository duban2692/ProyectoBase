package co.com.bancolombia.certification.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;

public class OpenTheBrowser implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Open.browserOn(new GoogleHomePage()));
		// Open,Click,Enter,Hit

	}

	public static OpenTheBrowser on() { // Sustitución del hijo, reemplaza al
										// padre
		// TODO Auto-generated method stub
		// return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class);
	}
}
