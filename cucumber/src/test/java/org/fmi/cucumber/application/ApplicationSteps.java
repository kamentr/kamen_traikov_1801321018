package org.fmi.cucumber.application;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fmi.cucumber.business.ApplicationService;
import org.fmi.cucumber.model.Administrator;
import org.fmi.cucumber.model.ApplicationResponse;
import org.fmi.cucumber.model.Child;
import org.fmi.cucumber.model.Parent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationSteps {

    private ApplicationService applicationService = new ApplicationService();
    private Parent parent = new Parent();
    private Child child = new Child();
    private Administrator administrator = new Administrator();
    private ApplicationResponse actual;

    @Given("^Един работещ родител$")
    public void един_работещ_родител() throws Throwable {
        child.setNumberOfWorkingParents(1);
    }

    @Given("^Има близнаци$")
    public void има_близнаци() throws Throwable {
        child.setTwin(true);
    }

    @When("^Регистрира децата си$")
    public void регистрира_децата_си() throws Throwable {
        actual = applicationService.register(child, parent, administrator);
    }

    @Then("^Трябва да получи \"([^\"]*)\" точки$")
    public void трябва_да_получи_точки(int points) throws Throwable {
        assertEquals(points, actual.getPoints());
    }

    @Given("^Двама работещи родителя$")
    public void двама_работещи_родителя() throws Throwable {
        child.setNumberOfWorkingParents(2);
    }

    @Given("^Имат едно дете с увреждане$")
    public void имат_едно_дете_с_увреждане() throws Throwable {
        child.setDisabled(true);
    }

    @When("^Регистрират детето си$")
    public void регистрират_детето_си() throws Throwable {
        actual = applicationService.register(child, parent, administrator);
    }

    @Given("^Има дете с брат/сестра в детското заведение$")
    public void има_дете_с_брат_сестра_в_детското_заведение() throws Throwable {
        child.setHasSiblingInKindergarten(true);
    }

    @Given("^Двама работещи родители$")
    public void двама_работещи_родители() throws Throwable {
        child.setNumberOfWorkingParents(2);
    }

    @Given("^Имат близнаци$")
    public void имат_близнаци() throws Throwable {
        child.setTwin(true);
    }

    @Given("^Едно дете с увреждане$")
    public void едно_дете_с_увреждане() throws Throwable {
        child.setDisabled(true);
    }

    @When("^Регистрират децата си$")
    public void регистрират_децата_си() throws Throwable {
        actual = applicationService.register(child, parent, administrator);
    }

    @Given("^Имат дете с брат/сестра в детското заведение$")
    public void имат_дете_с_брат_сестра_в_детското_заведение() throws Throwable {
        child.setHasSiblingInKindergarten(true);
    }
}
