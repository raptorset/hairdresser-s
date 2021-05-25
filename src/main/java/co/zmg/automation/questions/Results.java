package co.zmg.automation.questions;

import static co.zmg.automation.userinterface.ArticlesPage.BOXES;
import static co.zmg.automation.userinterface.ArticlesPage.TITLE_ARTICLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class Results implements Question<Boolean> {

	@Subject("check visible result on the page")
	@Override
	public Boolean answeredBy(Actor actor) {
		return BOXES.resolveFor(actor).isPresent() && TITLE_ARTICLE.resolveFor(actor).isVisible();
	}

	public static Results resultsFirtPage() {
		return new Results();
	}

}
