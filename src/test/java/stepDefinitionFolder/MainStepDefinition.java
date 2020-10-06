package stepDefinitionFolder;

import cucumber.api.java.en.Given;
import mainActionFolder.MainAction;

public class MainStepDefinition {
	
	MainAction MAP = new MainAction();

	@Given("^Launch chrome Browser for Youtube and channel name is \"([^\"]*)\" thankyou$")
	public void i_want_to_write_a_step_with_precondition(String ChannelName) throws Exception {

		System.out.println("Launching Browser.............");
		MAP.LaunchBrowerAction();
		MAP.YoutubeSearchAction(ChannelName);
		MAP.QuitBrowserAction();

	}
	
}
