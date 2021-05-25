package co.zmg.automation.interactions;

import static co.zmg.automation.userinterface.HomePage.CLOSE_COOKIE;
import static co.zmg.automation.userinterface.HomePage.CLOSE_MODAL;
import static co.zmg.automation.userinterface.HomePage.COOKIE_POLICY_NOTIFICATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.MoveMouse.to;
import static net.serenitybdd.screenplay.conditions.Check.whether;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class CloseCookies implements Interaction {

	@Override
	@Subject("#actor close some modals")
	public <T extends Actor> void performAs(T tous) {

		tous.attemptsTo(the(COOKIE_POLICY_NOTIFICATION, isVisible()).forNoMoreThan(3).milliseconds(),
				whether(modalIsVisible()).andIfSo(on(CLOSE_COOKIE)),
				to(CLOSE_MODAL).andThen(actions -> actions.click()));

	}

	private Question<Boolean> modalIsVisible() {
		return actor -> COOKIE_POLICY_NOTIFICATION.resolveFor(actor).isVisible();

	}

	public static CloseCookies closeCookies() {
		return instrumented(CloseCookies.class);

	}

}
