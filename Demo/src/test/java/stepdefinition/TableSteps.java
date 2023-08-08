package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TableValidation;


public class TableSteps {

@Given("Table validation")
    public void tableValidation() throws InterruptedException {
    TableValidation.tableHandle();
    Thread.sleep(2000);
    TableValidation.table2Handle(4);
}



}
