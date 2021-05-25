package co.zmg.automation.exceptions;


@SuppressWarnings("serial")
public class ValidateException extends AssertionError {

	public static final String FRONT_CHANGE = "The style of the results page changed and so did its objects for this reason the targets are not the same you know ...";

	public ValidateException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}
