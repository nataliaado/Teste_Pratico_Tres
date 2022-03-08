package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LaptopsPage {

    WebDriver driver;

    public LaptopsPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
    WebElement titulo;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[1]/label[2]")
    WebElement CUSTOMIZATION;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[2]/label[2]")
    WebElement DISPLAY;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[3]/label[2]")
    WebElement DISPLAY_RESOLUTION;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[4]/label[2]")
    WebElement DISPLAY_SIZE;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[5]/label[2]")
    WebElement MEMORY;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[6]/label[2]")
    WebElement OPERATING_SYSTEM;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[7]/label[2]")
    WebElement PROCESSOR;

    @FindBy(how = How.XPATH, using = "//html/body/div[3]/section/article[2]/div[8]/label[2]")
    WebElement TOUCHSCREEN;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[2]/div[9]/label[2]")
    WebElement WEIGHT;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[3]")
    WebElement GRAY;

    @FindBy(how = How.NAME, using = "save_to_cart")
    WebElement ADD_TO_CART;

    @FindBy(how= How.ID, using = "shoppingCartLink")
    WebElement carrinho;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[6]")
    WebElement YELLOW;

    @FindBy(how = How.NAME, using = "quantity")
    WebElement quantity;


    public String texto(){
        String text = titulo.getAttribute("innerText");
        return text;
    }

    public String CUSTOMIZATION(){
        String text = CUSTOMIZATION.getAttribute("innerText");
        return text;
    }

    public String DISPLAY(){
        String text = DISPLAY.getAttribute("innerText");
        return text;
    }

    public String DISPLAY_RESOLUTION(){
        String text = DISPLAY_RESOLUTION.getAttribute("innerText");
        return text;
    }

    public String DISPLAY_SIZE(){
        String text = DISPLAY_SIZE.getAttribute("innerText");
        return text;
    }

    public String MEMORY(){
        String text = MEMORY.getAttribute("innerText");
        return text;
    }

    public String OPERATING_SYSTEM(){
        String text = OPERATING_SYSTEM.getAttribute("innerText");
        return text;
    }

    public String PROCESSOR(){
        String text = PROCESSOR.getAttribute("innerText");
        return text;
    }

    public String TOUCHSCREEN(){
        String text = TOUCHSCREEN.getAttribute("innerText");
        return text;
    }

    public String WEIGHT(){
        String text = WEIGHT.getAttribute("innerText");
        return text;
    }

    public String GRAY(){
        String text = GRAY.getAttribute("title");
        return text;
    }

    public void clickGRAY(){
        GRAY.click();
    }

    public void clickbtnADD_TO_CART(){
        ADD_TO_CART.click();
    }
    public void clickcarrinho(){
        carrinho.click();
    }

    public void clickYELLOW(){
        YELLOW.click();
    }

    public void alteraquantity(){
        quantity.click();
        quantity.sendKeys("2");
    }

}
