package org.example.pages;

import com.thoughtworks.gauge.Step;

import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class HomePage extends StepImplementation {

    @Step("Açılış Sayfası Kontrolü İşlemi")
    public void openHomePage() {
        String alisverisBtn = findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).getText();
        Assertions.assertEquals("ALIŞVERİŞE BAŞLA",alisverisBtn,"Hatalı alışveris Butonu");
        logger.info("Uygulamanın düzgün olarak başladığını gördük.");
    }
}