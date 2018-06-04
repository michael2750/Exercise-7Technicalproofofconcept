package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItWeekday {

    static String isItWeekday(String[] days) {
        for (String day : days) {
            if(day != "Sunday" && day != "Saturday"){
                return "Yep";
            }
        }
        return "Nope";
    }
}

public class Stepdefs {

    private String[] days;
    private String actualAnswer;

    @Given("^today is either Sunday or Saturday$")
    public void today_is_Sunday_or_Saturday() {
        this.days = new String[2];
        this.days[0] = "Sunday";
        this.days[1] = "Saturday";
    }

    @When("^I ask whether it is a weekday$")
    public void i_ask_whether_is_is_a_weekday() {
        this.actualAnswer = IsItWeekday.isItWeekday(days);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}
