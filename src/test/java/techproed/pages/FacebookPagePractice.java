package techproed.pages;

import techproed.utilities.DriverPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPagePractice {

    public FacebookPagePractice() {

        PageFactory.initElements(DriverPractice.getDriver(),this);

    }


    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement sifreKutusu;


    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButonu;


    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girdiginSifreYanlisYaziElementi;






}