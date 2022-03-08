package Steps;

import Pages.HomePage;
import Pages.LaptopsPage;
import Pages.ShoppingCartPage;
import Util.Driver;
import io.cucumber.java.After;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class StepsDefinitions {

    WebDriver driver;
    HomePage home;
    LaptopsPage laptops;
    ShoppingCartPage shopping;

    @Dado("que tenha que acessar o site")
    public void acessar_site() throws InterruptedException {
        Driver wdriver = new Driver();
        driver = wdriver.Webdriver();
    }

    @Quando("realizar a pesquisa do SPECIAL OFFER")
    public void realizar_pesquisa_special_offer() throws InterruptedException {
        Thread.sleep(5000);
        home = PageFactory.initElements(driver, HomePage.class);
        home.wait_specialOffer();
        home.click_specialOffer();
        Thread.sleep(1000);
        home.click_seeOffer();
    }

    @Entao("valido que as especificacoes do produto esta de acordo com as informacoes")
    public void validar_especificacoes_do_produto_de_acordo_com_as_informacoes() throws InterruptedException {
        Thread.sleep(5000);
        laptops = PageFactory.initElements(driver, LaptopsPage.class);
        Assert.assertEquals("HP PAVILION 15Z TOUCH LAPTOP", laptops.texto());
        Assert.assertEquals("Simplicity", laptops.CUSTOMIZATION());
        Assert.assertEquals("15.6-inch diagonal Full HD WLED-backlit Display (1920x1080) Touchscreen", laptops.DISPLAY());
        Assert.assertEquals("1920x1080", laptops.DISPLAY_RESOLUTION());
        Assert.assertEquals("15.6", laptops.DISPLAY_SIZE());
        Assert.assertEquals("16GB DDR3 - 2 DIMM", laptops.MEMORY());
        Assert.assertEquals("Windows 10", laptops.OPERATING_SYSTEM());
        Assert.assertEquals("AMD Quad-Core A10-8700P Processor + AMD Radeon(TM) R6 Graphics", laptops.PROCESSOR());
        Assert.assertEquals("Yes", laptops.TOUCHSCREEN());
        Assert.assertEquals("5.51 lb", laptops.WEIGHT());
        Assert.assertEquals("GRAY", laptops.GRAY());

    }

    @Quando("adiciono no carrinho o produto com a cor desejada")
    public void adicionar_no_carrinho_produto_com_cor_desejada() throws InterruptedException {
        Thread.sleep(5000);
        laptops = PageFactory.initElements(driver, LaptopsPage.class);
        laptops.clickGRAY();
        laptops.clickbtnADD_TO_CART();
    }

    @Entao("valido que produto foi adicionado ao carrinho com a cor selecionada")
    public void validar_produto_foi_adicionado_ao_carrinho_com_cor_selecionada() throws InterruptedException {
        Thread.sleep(5000);
        laptops =  PageFactory.initElements(driver, LaptopsPage.class);
        Thread.sleep(1000);
        laptops.clickcarrinho();
        Thread.sleep(1000);
        shopping = PageFactory.initElements(driver, ShoppingCartPage.class);
        Assert.assertEquals("HP PAVILION 15Z TOUCH LAPTOP", shopping.textoproduto());
        Assert.assertEquals("GRAY", shopping.textocor());
        Assert.assertEquals("1", shopping.textoQTD());

    }

    @Quando("pesquiso o produto selecionando uma cor diferente do banco")
    public void pesquiso_o_produto_selecionando_uma_cor_diferente_do_banco() throws InterruptedException {
        Thread.sleep(5000);
        home = PageFactory.initElements(driver, HomePage.class);
        home.wait_specialOffer();
        home.click_specialOffer();
        Thread.sleep(1000);
        home.click_seeOffer();
        Thread.sleep(5000);
        laptops = PageFactory.initElements(driver, LaptopsPage.class);
        laptops.clickYELLOW();

    }

    @Quando("altero a quantidade de comprar adicionando no carrinho")
    public void alterar_quantidade_de_comprar_adicionando_no_carrinho() throws InterruptedException {
        Thread.sleep(5000);
        laptops = PageFactory.initElements(driver, LaptopsPage.class);
        laptops.alteraquantity();
        laptops.clickbtnADD_TO_CART();

    }

    @Quando("acesso a pagina check out")
    public void acessar_pagina_check_out() throws InterruptedException {
        Thread.sleep(5000);
        laptops = PageFactory.initElements(driver, LaptopsPage.class);
        laptops.clickcarrinho();
        shopping = PageFactory.initElements(driver, ShoppingCartPage.class);
        Thread.sleep(1000);
        shopping.checkOutButtonclick();

    }

    @Entao("valido que a soma dos precos corresponde ao total apresentado na pagina de checkout")
    public void validar_a_soma_dos_precos_corresponde_ao_total_apresentado_na_pagina_de_checkout() throws InterruptedException {
        Thread.sleep(5000);
        shopping = PageFactory.initElements(driver, ShoppingCartPage.class);
        Assert.assertEquals("$899.98", shopping.textototal());
    }

    @Entao("acesso o carrinho e removo o produto")
    public void acessar_o_carrinho_e_remover_produto() throws InterruptedException {
        Thread.sleep(5000);
        laptops = PageFactory.initElements(driver, LaptopsPage.class);
        laptops.clickcarrinho();
        shopping = PageFactory.initElements(driver, ShoppingCartPage.class);
        shopping.cbtnremoveclick();
    }

    @Entao("valido que o carrinho esta vazio")
    public void validar_carrinho_esta_vazio() throws InterruptedException {
        Thread.sleep(5000);
        shopping = PageFactory.initElements(driver, ShoppingCartPage.class);
        Assert.assertEquals("Your shopping cart is empty", shopping.textocarrinhovazio());
    }

    @After
    public void executionEnd(){
        driver.close();
        driver.quit();
    }

}
