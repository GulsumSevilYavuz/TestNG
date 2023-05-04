package techproed.tests.day01_practice;


import techproed.pages.FacebookPagePractice;
import techproed.utilities.ConfigReader;
import techproed.utilities.DriverPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_PageClassKullanimi {

    // facebook anasayfaya gidin
    // kullanıcı email kutusuna rastgele bir isim yazın
    // kullanıcı sifre kutusuna rastgele bir password yazın
    // giris yap butonuna tıklayın
    // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
    // sayfayı kaptın


    @Test
    public void test01() {


        // facebook anasayfaya gidin
        DriverPractice.getDriver().get(ConfigReader.getProperty("facebookUrl"));


        // kullanıcı email kutusuna rastgele bir isim yazın

        FacebookPagePractice facebookPage = new FacebookPagePractice();
        facebookPage.emailKutusu.sendKeys("Ahmet");



        // kullanıcı sifre kutusuna rastgele bir password yazın
        facebookPage.sifreKutusu.sendKeys("123456");




        // giris yap butonuna tıklayın
        facebookPage.girisYapButonu.click();



        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue(facebookPage.girdiginSifreYanlisYaziElementi.isDisplayed());


        // sayfayı kaptın
        DriverPractice.closeDriver();



    }
}