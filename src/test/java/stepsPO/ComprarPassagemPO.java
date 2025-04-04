package stepsPO;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class ComprarPassagemPO {
    // Atributos

    final WebDriver driver;

    // Anotações @Before @After ficam localizados no arquivo Hooks.java

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String string) {
        
    }

    @Quando("seleciono a origem {string} e destino {string} PO")
    public void seleciono_a_origem_e_destino_po(String string, String string2) {
        
    }

    @E("clico no botao Find Flights PO")
    public void clico_no_botao_find_flights_po() {
       
    }

    @Entao("visualiza a lista de voos PO")
    public void visualiza_a_lista_de_voos_po() {
       
    }
}
