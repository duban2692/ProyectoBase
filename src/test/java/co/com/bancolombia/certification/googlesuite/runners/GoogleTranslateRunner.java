package co.com.bancolombia.certification.googlesuite.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class) //ejecutar un test con junit, con la clase CucumberWithSerenity que va ejecutar el proyecto.
//entro otras cosas ejecuta el test y genera el informe de serenity
//tenemos acceso por la dependencias

@CucumberOptions( // lo que vamos ejecutar
		features = "src/test/resources/features/google_translate.feature",
		glue = "co.com.bancolombia.certification.googlesuite.runners",
		snippets = SnippetType.CAMELCASE
		)

public class GoogleTranslateRunner {

}
