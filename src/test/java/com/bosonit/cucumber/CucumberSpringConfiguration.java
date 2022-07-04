package com.bosonit.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberApplication.class, webEnvironment =SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = CucumberApplication.class, loader = SpringBootContextLoader.class)
public class CucumberSpringConfiguration {
}
