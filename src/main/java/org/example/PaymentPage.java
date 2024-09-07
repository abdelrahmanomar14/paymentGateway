package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {

    WebDriver driver;
    WebDriverWait wait;
    By CardNumber = By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/form/div[1]/div/div/input");
    By ExpiryDate = By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/form/div[2]/div/div/input");
    By CVV = By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/form/button");
    By payCard = By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/form/button");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
    }

    public void enterCardNumberField(String email) {
        try {
            WebElement emailElem = (WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.CardNumber));
            emailElem.sendKeys(new CharSequence[]{email});
        } catch (TimeoutException var3) {
            TimeoutException e = var3;
            System.out.println("Email field is not visible: " + e.getMessage());
        } catch (NoSuchElementException var4) {
            NoSuchElementException e = var4;
            System.out.println("Email field is not found: " + e.getMessage());
        }

    }

    public void enterExpiryDateField(String password) {
        try {
            WebElement passwordElem = (WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.ExpiryDate));
            passwordElem.sendKeys(new CharSequence[]{password});
        } catch (TimeoutException var3) {
            TimeoutException e = var3;
            System.out.println("Password field is not visible: " + e.getMessage());
        } catch (NoSuchElementException var4) {
            NoSuchElementException e = var4;
            System.out.println("Password field is not found: " + e.getMessage());
        }

    }

    public void enterCVVField(String password) {
        try {
            WebElement passwordElem = (WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.CVV));
            passwordElem.sendKeys(new CharSequence[]{password});
        } catch (TimeoutException var3) {
            TimeoutException e = var3;
            System.out.println("Password field is not visible: " + e.getMessage());
        } catch (NoSuchElementException var4) {
            NoSuchElementException e = var4;
            System.out.println("Password field is not found: " + e.getMessage());
        }

    }

    public void  payCardButton() {
        try {
            WebElement loginBtnElem = (WebElement)this.wait.until(ExpectedConditions.elementToBeClickable(this.payCard));
            loginBtnElem.click();
        } catch (TimeoutException var2) {
            TimeoutException e = var2;
            System.out.println("Login button is not clickable: " + e.getMessage());
        } catch (NoSuchElementException var3) {
            NoSuchElementException e = var3;
            System.out.println("Login button is not found: " + e.getMessage());
        }

    }


}
