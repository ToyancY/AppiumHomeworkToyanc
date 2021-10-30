package org.example.pages;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class Product extends StepImplementation {
    @Step("Product detail sayfası doğrulama işlemi")
    public void checkProduct(){
        boolean checkProduct = findElement(By.id("com.ozdilek.ozdilekteyim:id/imgCart")).isDisplayed();
        Assertions.assertTrue(checkProduct,"Product detay sayfası hatalı");
        logger.info("Ürün detayları sayfasında olduğumuz doğrulandı.");
    }
}