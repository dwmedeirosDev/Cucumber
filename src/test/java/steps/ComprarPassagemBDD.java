package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ComprarPassagemBDD {

    WebDriver driver; // Objeto do Selenium WB

    @Before
    public void iniciar(){
        WebDriverManager.chromedriver().setup(); // Garantir o driver correto para o Chrome
        driver = new ChromeDriver(); // Instaciar como ChromeDriver

        // Definir um tempo de espera implícita de 3 segundos
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)); 
        driver.manage().window().maximize(); // Exibir janela maximizada
    }

    @After
    public void finalizar(){
        driver.quit(); // Finalizar objeto do Selenium WB
    }

    @Dado("que acesso o site {string}")
    public void que_acesso_o_site(String string) {
        
    }

    @Quando("seleciono a origem {string} e destino {string}")
    public void seleciono_a_origem_e_destino(String string, String string2) {
        
    }

    @E("clico no botão Find Flights")
    public void clico_no_botão_find_flights() {
        
    }

    @Entao("visualiza a lista de voos")
    public void visualiza_a_lista_de_voos() {
        
    }
}