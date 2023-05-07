package techproed.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class AmazonStepDefinition{
    AmazonPage amazonPage;
    @Given("kullanici_amazon_sayfasina_gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
    }
    @Then("arama_kutusunda_iphone_aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramakutusu.sendKeys("iphone",Keys.ENTER);

    }
    @And("sayfayi_kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("arama_kutusunda_Selenium_aratir")
    public void arama_kutusunda_selenium_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramakutusu.sendKeys("selenium",Keys.ENTER);

    }

    @And("arama_kutusunda_java_aratir")
    public void arama_kutusunda_java_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramakutusu.sendKeys("java",Keys.ENTER);
    }

    @And("arama_kutusunda_sql_aratir")
    public void arama_kutusunda_sql_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramakutusu.sendKeys("sql",Keys.ENTER);
    }

}
