package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "/html/body/header/nav/ul/li[7]/a")
    WebElement link_specialOffer;

    @FindBy(how= How.ID, using = "see_offer_btn")
    WebElement btn_seeOffer;

    @FindBy(how= How.XPATH, using = "/html/body/header/nav/ul/li[2]/a/svg/path")
    WebElement carrinho;

    public void wait_specialOffer(){
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(link_specialOffer));
    }

    public void wait_seeOffer(){
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(btn_seeOffer));
    }

    public void click_specialOffer(){
        link_specialOffer.click();
    }

    public void click_seeOffer(){
        btn_seeOffer.click();
    }

    public void clickcarrinho(){
        carrinho.click();
    }

}
