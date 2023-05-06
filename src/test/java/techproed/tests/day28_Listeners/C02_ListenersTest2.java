package techproed.tests.day28_Listeners;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

@Listeners(techproed.utilities.Listeners.class)
public class C02_ListenersTest2{
    /*
    Bir class'ta listener kullanabilmek için class'dan önce @Listeners notasyonu eklememiz gerekir.
    Notasyon içine parametre olarak Listeners class'ının yolunu belirtmemiz gerekir.
     */
    @Test
    public void test01() {
        System.out.println("passed");
        Assert.assertTrue(true);
        Assert.assertEquals(2,2);
    }
    @Test
    public void test02() {
        System.out.println("failed");
        Assert.assertTrue(false);

    }
    // @Ignore // IGNORE EDER YANI ATLAR
    @Test
    public void test03() {
        System.out.println("Skip");
        throw new SkipException("Method atlandi")  ;


    }
    @Test
    public void test04() {

        System.out.println("NO SUCH ELEMET EXCEPTION");
        //  throw new NoSuchElementException("BÖYLE BIR ELEMAN BULUNAMADI");
        //  BUDA OLUR// Exception alinca Listener napicak ona bakicaz
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Driver.getDriver().findElement(By.xpath("HLHGKG"));
    }
}