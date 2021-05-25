package co.zmg.automation.userinterface;


import static org.openqa.selenium.By.cssSelector;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ArticlesPage {

	public static final Target ARTICLES = Target.the("range days")
			.located(By.cssSelector("[class='vrl-result-item vrl-list-view-tile ng-scope']"));
	public static final Target BOXES = Target.the("range days")
			.located(cssSelector("[class='vrg-search-unit']"));
	public static final Target ALL_SHOW_DATES_BUTTON = Target.the("range days")
			.located(By.cssSelector("[class='vrl-item__action vrl-item__action--learn-more-desktop']"));
	public static final Target PRICING_OPTION = Target.the("range days")
			.located(By.cssSelector("[class='sfn-nav__item sfn-nav__item-pricing']"));
//	#################
	public static final Target OBJECT_LEFT = Target.the("range days")
			.located(By.cssSelector("span[aria-valuenow='300']"));
	public static final Target OBJECT_LEFT_AFTER = Target.the("range days")
			.located(cssSelector("span[aria-valuenow='610']"));

//	#################
	public static final Target OBJECT_RIGHT = Target.the("range days")
			.located(cssSelector("span[aria-valuenow='1300']"));
	public static final Target OBJECT_RIGHT_AFTER = Target.the("range days")
			.located(By.cssSelector("span[aria-valuenow='1300']"));
	public static final Target ARTICLES_LIST = Target.the("range days")
			.located(By.cssSelector("[ng-switch-when='list']"));
	public static final Target EXTRA_VALUE = Target.the("range days")
			.located(cssSelector("[class='vrl-item__actions']"));
	public static final Target TITLE_ARTICLE = Target.the("range days")
			.located(cssSelector("[class='cgc-cruise-glance__title']"));
}
