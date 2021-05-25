package co.zmg.automation.tasks;

import static co.zmg.automation.userinterface.ArticlesPage.PRICING_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static org.openqa.selenium.Keys.ARROW_LEFT;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class Filter implements Task {

	@Override
	@Step("{0} Filter by any price ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(on(PRICING_OPTION));
//		

		/*
		 *
		 * actor.attemptsTo(keyValues(ARROW_LEFT).into(ArticlesPage.OBJECT_LEFT));
		 * WebDriverFacade facade = null;
		 * actor.attemptsTo(MoveMouse.to(ArticlesPage.OBJECT_LEFT).andThen( actions ->
		 * actions.moveToElement(facade.findElement(By.cssSelector(
		 * "span[aria-valuenow='610']")))));
		 * actor.attemptsTo(MoveMouse.to(ArticlesPage.OBJECT_LEFT).andThen(actions ->
		 * actions.key));
		 */
	}

	public void mySendKeys(WebElementFacade elementFacade) {

		for (int i = 0; i < 6; i++) {
			elementFacade.sendKeys(ARROW_LEFT);

		}

	}

	public static Filter byPrice() {
		return instrumented(Filter.class);
	}

}
