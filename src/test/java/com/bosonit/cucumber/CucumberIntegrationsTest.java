package com.bosonit.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//indicamos que realice los test con la clase cucumber
@RunWith(Cucumber.class)
//indicamos la ruta del fichero .feature
@CucumberOptions(features = "src/test")
public class CucumberIntegrationsTest {
}
