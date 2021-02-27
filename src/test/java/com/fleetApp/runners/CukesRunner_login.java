package com.fleetApp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumberLogin.json",
                "timeline:target/timeline-report"
        },
        features = {
                "src/test/resources/features/login.feature"
        },
        glue = {"com/fleetApp/step_definitions"},
        dryRun = false,
        tags = "",
        publish = true
)

public class CukesRunner_login {
}
