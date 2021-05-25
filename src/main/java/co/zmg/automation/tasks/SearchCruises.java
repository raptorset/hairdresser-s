package co.zmg.automation.tasks;

import static co.zmg.automation.interactions.CloseCookies.closeCookies;
import static co.zmg.automation.userinterface.HomePage.DAYS;
import static co.zmg.automation.userinterface.HomePage.DURATION_BUTTON;
import static co.zmg.automation.userinterface.HomePage.SEARCH_CRUISES_BUTTON;
import static co.zmg.automation.utils.Constans.URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Open.url;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SearchCruises implements Task {

	private String days;

	public SearchCruises(String days) {
		this.days = days;
	}

	@Override
	@Step("{0} find land cruiser")
	public <T extends Actor> void performAs(T juanTousMaya) {
		juanTousMaya.attemptsTo(url(URL));
		juanTousMaya.attemptsTo(closeCookies(), on(DURATION_BUTTON), on(DAYS.of(days.concat(" "))),
				on(SEARCH_CRUISES_BUTTON));

	}

	public static SearchCruises withDurationBetween(String days) {
		return instrumented(SearchCruises.class, days);
	}

}
