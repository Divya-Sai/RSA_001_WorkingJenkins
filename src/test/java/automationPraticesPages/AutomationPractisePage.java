package automationPraticesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractisePage {

	WebDriver driver;

	//CheckBox Examples WebElements
	@FindBy(id="checkBoxOption1")
	private WebElement chkbox1;

	@FindBy(id="checkBoxOption2")
	private WebElement chkbox2;

	@FindBy(id="checkBoxOption3")
	private WebElement chkbox3;

	public AutomationPractisePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void isCheckedOption1() {
		chkbox1.click();
	}

	public void isCheckedOption2() {
		chkbox2.click();
	}

	public void isCheckedOption3() {
		chkbox3.click();
	}

    public void sdelissue001(){
		System.out.println("this is issueid001method");
	}

	public void sdelissue002(){
		System.out.println("this is issueid002method");
	}

	public void isenabledinIssue002(){
		System.out.println("isenabledinIssue002");
	}

	public void nextissuesdelissue0001(){
		System.out.println("nextissuesdelissue0001");
	}
}
