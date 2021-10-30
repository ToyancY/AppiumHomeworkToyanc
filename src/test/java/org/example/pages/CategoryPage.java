package org.example.pages;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CategoryPage extends StepImplementation {
    @Step("Kategori Sayfası Kontrolü İşlemi")
    public void textCtrl(){
        String textCtrl = findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']")).getAttribute("content-desc");
        Assertions.assertEquals("Kategoriler",textCtrl,"Kategori sayfası hatalı");
        logger.info("Kategoriler sayfasında olduğumuzu doğruladık.");
    }
}