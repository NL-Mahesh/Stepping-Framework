package webdriverconcepts;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    @Test
    public void test() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("#treebox1 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td:nth-child(2) > table > tbody > tr > td.standartTreeRow > span")).click();
        WebElement elementToMove = driver.findElement(By.cssSelector("#treebox1 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td:nth-child(2) > table > tbody > tr > td.standartTreeRow > span"));
        WebElement moveToElement = driver.findElement(By.cssSelector("#treebox1 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td.standartTreeRow > span"));
        Actions dragAndDrop = new Actions(driver);
        Action action = dragAndDrop.dragAndDrop(elementToMove, moveToElement).build();
        action.perform();
    }
}