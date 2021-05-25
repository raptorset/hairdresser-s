package co.zmg.automation.questions;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheResults implements Question<List<String>> {

	private Target target;

	public TheResults(Target target) {
		this.target = target;
	}

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asList();
	}

	public static TheResults of(Target target) {
		return new TheResults(target);
	}

}
