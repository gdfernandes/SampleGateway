package org.gdfernandes.samples.gateway.cucumber.stepdefs;

import org.gdfernandes.samples.gateway.SampleGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampleGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
