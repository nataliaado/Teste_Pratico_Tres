package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage {

    @FindBy(how= How.XPATH, using = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[2]/label")
    WebElement produto;

    @FindBy(how= How.XPATH, using = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[4]/span")
    WebElement cor;

    @FindBy(how= How.XPATH, using = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[5]/label[2]")
    WebElement QTD;

    @FindBy(how= How.ID, using = "checkOutButton")
    WebElement checkOutButton;

    @FindBy(how= How.XPATH, using = "//*[@id=\"userCart\"]/div[2]/label[2]/span")
    WebElement total;

    @FindBy(how= How.XPATH, using = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[3]")
    WebElement btnremove;

    @FindBy(how= How.XPATH, using = "//*[@id=\"shoppingCart\"]/div/label")
    WebElement carrinhovazio;

    public String textoproduto(){
       String text = produto.getAttribute("innerText");
       return text;
    }

    public String textocor(){
        String text = cor.getAttribute("title");
        return text;
    }

    public String textoQTD(){
        String text = QTD.getAttribute("innerText");
        return text;
    }

    public void checkOutButtonclick(){
        checkOutButton.click();
    }

    public String textototal(){
        String text = total.getAttribute("innerText");
        return text;
    }

    public void cbtnremoveclick(){
        btnremove.click();
    }

    public String textocarrinhovazio(){
        String text = carrinhovazio.getAttribute("innerText");
        return text;
    }

}
