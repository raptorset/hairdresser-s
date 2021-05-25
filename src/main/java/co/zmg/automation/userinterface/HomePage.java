package co.zmg.automation.userinterface;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static final Target DURATION_BUTTON = the("the duration")
			.located(By.cssSelector("li[class='cdc-filters-tab cdc-filters-tab--durations']"));
	public static final Target DAYS_ = the("range days")
			.located(cssSelector("ul[class='cdc-filter-cols-wrapper'] li:nth-of-type(2)"));
	public static final Target MODAL = the("range days").located(id("MainBody"));
	public static final Target LOGO_MODAL = the("logo modal")
			.located(By.cssSelector("div .vifp-sweeps-modal-logo-carnival"));
	public static final Target COOKIE_POLICY_NOTIFICATION = the("range days")
			.located(By.cssSelector("div[class=cp-banner__heading]  strong"));
	public static final Target CLOSE_COOKIE = the("range days").located(By.id("cookie-consent-btn"));
	public static final Target MODAL_BUTTON_ = the("range days")
			.located(By.cssSelector("[class='vifp-sweeps-modal-button']"));
	public static final Target CLOSE_MODAL = the("range days").located(By.cssSelector("div [class='vifp-close']"));
	public static final Target SEARCH_CRUISES_BUTTON = the("range days")
			.located(By.cssSelector("[class='cdc-filters-tab cdc-filters-tab--searchcta ng-scope']"));
	public static final Target BUTTON_TEXT = the("range days")
			.locatedBy("//li[@class='cdc-filter-3-cols-layout ng-scope' and contains(text,'{0}')]");
	public static final Target DAYS = the("range days").located(cssSelector("button[aria-label='{0}']"));

}
