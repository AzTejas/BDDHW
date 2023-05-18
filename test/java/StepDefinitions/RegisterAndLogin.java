package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAndLogin {
    WebDriver driver;

    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter an Url$")
    public void enter_an_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("^User Click on Register Link$")
    public void user_Click_on_Register_Link()  {
        driver.findElement(By.className("ico-register")).click();
    }

    @When("^User on Register Page and Verify Register page Title$")
    public void user_on_Register_Page_and_Verify_Register_page_Title() {
        String regtitle = driver.getTitle();
        System.out.println(regtitle);
        Assert.assertEquals("nopCommerce demo store. Register",regtitle);
    }

    @Then("^User select gender, \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_select_gender_and(String FirstName, String LastName) {
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys(FirstName);
        driver.findElement(By.id("LastName")).sendKeys(LastName);
    }

    @Then("^User Select the their Date of Birth with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Select_the_their_Date_of_Birth_with_and_and(String BirthDay, String BirthMonth, String BirthYear) {
        //Date of Birth Day, Month and Year
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys(BirthDay);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys(BirthMonth);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys(BirthYear);
    }

    @Then("^User Enter their \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and Click on Register Button$")
    public void user_Enter_their_and_and_and_Click_on_Register_Button(String Email, String Password, String ConfirmPassword) throws InterruptedException {
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(Password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).click();
    }

    @Then("^User is on Home Page and Verify Home Page Title$")
    public void user_is_on_Home_Page_and_Verify_Home_Page_Title()  {
        String hometitle = driver.getTitle();
        System.out.println(hometitle);
        Assert.assertEquals("nopCommerce demo store",hometitle);
    }

    @Then("^User Close the Browser$")
    public void user_Close_the_Browser()  {
        driver.close();
    }

    @When("^User click on Login Link$")
    public void user_click_on_Login_Link() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.className("ico-login")).click();
    }

    @When("^User on Login Page and Verify Login page Title$")
    public void user_on_Login_Page_and_Verify_Login_page_Title(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login",title);
    }

    @Then("^User enter \"([^\"]*)\" and \"([^\"]*)\" and Click on login button$")
    public void user_enter_and_and_Click_on_login_button(String Username, String Password) {
        driver.findElement(By.id("Email")).sendKeys(Username);
        driver.findElement(By.id("Password")).sendKeys(Password);
        driver.findElement(By.className("login-button")).click();
    }

    @Then("^User is on Home Page and Verify Home page Title$")
    public void user_is_on_Home_Page_and_Verify_Home_page_Title(){
    }

    @Then("^User close the browser$")
    public void user_close_the_browser() {
        driver.close();
    }
}
