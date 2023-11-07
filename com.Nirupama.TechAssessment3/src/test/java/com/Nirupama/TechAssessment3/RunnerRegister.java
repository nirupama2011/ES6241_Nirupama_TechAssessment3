package com.Nirupama.TechAssessment3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Register.feature", glue ="com.Nirupama.TechAssessment3")

public class RunnerRegister {

}
