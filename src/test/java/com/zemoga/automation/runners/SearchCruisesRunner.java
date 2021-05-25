package com.zemoga.automation.runners;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_cruises.feature", 
glue = "com/zemoga/automation/stepdefinitions", 
snippets = CAMELCASE, 
tags = "@tag2")
public class SearchCruisesRunner {

}
