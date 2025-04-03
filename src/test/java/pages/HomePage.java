package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{

    // 1. Construtor
    public HomePage(WebDriver driver){
        super(driver) // Driver herdado de CommonPage (Super classe)
        PageFactory.initElements(driver, this); 
    }

    // 2. Elementos mapeados

    // Mapeamento do Origem e Destino
    public By bylocal(String local){
        return By.cssSelector("option[value=\"" + local + "\"]");
    }

    // Mapeando botão "Find Flights"
    @FindBy(css = ".btn-primary") 
    WebElement btnFindFlights;


    
    // 3. Ações com os elementos


}
