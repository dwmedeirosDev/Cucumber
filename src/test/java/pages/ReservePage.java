package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends CommonPage {

    // Construtor
    public ReservePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Mapeamento de elementos
    @FindBy(css = "h3")
    WebElement flightsHeader; // Cabeçalho de vôo

    // Ações
    public String lerCabecalhoVoos() {
        return flightsHeader.getText();
    }

    
}
