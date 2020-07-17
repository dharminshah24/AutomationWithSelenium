package com.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver","C:\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Dharminkumar");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Shah");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("drastapatel25@gmail.com");
        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        reEmail.sendKeys("drastapatel25@gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("KILLERk@024");
        WebElement month = driver.findElement(By.id("month"));
        Select month_Select = new Select(month);
        month_Select.selectByValue("12");

        WebElement date = driver.findElement(By.id("day"));
        Select dateSelect = new Select(date);
        dateSelect.selectByIndex(24);

        WebElement year = driver.findElement(By.id("year"));
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1992");

        WebElement gender = driver.findElement(By.id("u_0_7"));
        gender.click();

        WebElement signupBtnClick = driver.findElement(By.id("u_0_15"));
        signupBtnClick.click();
    }
}
