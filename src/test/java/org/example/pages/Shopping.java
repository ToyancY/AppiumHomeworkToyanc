package org.example.pages;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class Shopping extends StepImplementation {
    @Step("Alışveriş sayfası doğrulama işlemi")
    public void checkShopping(){
        String checkText = findElement(By.id("com.ozdilek.ozdilekteyim:id/relLayStore")).getAttribute("resource-id");
        Assertions.assertEquals("com.ozdilek.ozdilekteyim:id/relLayStore",checkText,"Alışveris sayfası düzgün çalışmıyor");
        logger.info("Alışveriş Sayfasının Açıldığı Doğrulandı.");
    }

}