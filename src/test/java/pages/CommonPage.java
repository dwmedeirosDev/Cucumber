package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {
    public WebDriver driver; // Objeto Selenium WebDriver (Universal)

    // Construtor - Conecta o exterior com o interior da classe
    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    // ToDo: Funções em comum das páginas

    public String lerNomeDaGuia(){
        return driver.getTitle(); // Lê o título da guia/página
    }
}