package com.zemoga.automation.stepdefinitions;

import static co.zmg.automation.exceptions.ValidateException.FRONT_CHANGE;
import static co.zmg.automation.questions.Results.resultsFirtPage;
import static co.zmg.automation.tasks.Filter.byPrice;
import static co.zmg.automation.tasks.SearchCruises.withDurationBetween;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import co.zmg.automation.exceptions.ValidateException;
import co.zmg.automation.models.CruiseData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CruisesStepDefinitions {

	@When("^the tourist performs the search with a duration (.*)$")
	public void theTouristPerformsTheSearchWithADurationDays(String days) {
		theActorInTheSpotlight().attemptsTo(withDurationBetween(days));

	}

	@Then("^he would filter by price$")
	public void heWouldFilterByPrice() {
		theActorInTheSpotlight().attemptsTo(byPrice());

	}

	@Then("^he would visualize the results with a grid style$")
	public void heWouldVisualizeTheResultsWithAGridStyle() {
		theActorInTheSpotlight()
				.should(seeThat(resultsFirtPage()).orComplainWith(ValidateException.class, FRONT_CHANGE));

	}

}
