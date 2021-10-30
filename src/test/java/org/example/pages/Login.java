package org.example.pages;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class Login extends StepImplementation {
    @Step("Login page doğrulama işlemi")
    public void checkLoginPage(){
        boolean loginBtnVisible = findElement(By.id("com.ozdilek.ozdilekteyim:id/btnLogin")).isDisplayed();
        Assertions.assertTrue(loginBtnVisible,"login sayfası dogrulanmadı");
        logger.info("login sayfasında olduğumuz doğrulandı.");
    }
}