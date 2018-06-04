/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class Weekday {

    private String[] days;
    private String actualAnswer;

    @Given("^today is either Monday or Saturday$")
    public void today_is_Sunday_or_Saturday() {
        this.days = new String[2];
        this.days[0] = "Monday";
        this.days[1] = "Saturday";
    }

    @When("^I ask wether it's a weekday$")
    public void i_ask_whether_is_is_a_weekday() {
        this.actualAnswer = IsItWeekday.isItWeekday(days);
    }

    @Then("^I should bee told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
