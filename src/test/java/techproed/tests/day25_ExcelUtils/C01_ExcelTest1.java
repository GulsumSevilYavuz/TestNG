package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtils;

public class C01_ExcelTest1 {

    @Test
    public void excelTest1() {
     String path=  "src/test/java/resources/mysmoketestdata (2).xlsx ";
     String sayfa=   "customer_Info";
        ExcelUtils   excelUtils=new ExcelUtils(path,sayfa);
        System.out.println(excelUtils.getCellData(1, 0));
String email= excelUtils.getCellData(1,0);
String password=excelUtils.getCellData(1,1);
        System.out.println(email+"||"+password);

    }
}
