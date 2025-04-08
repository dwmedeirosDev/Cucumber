package stepsPO;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.Base;
import pages.HomePage;
import pages.ReservePage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class ComprarPassagemPO {
    // Atributos

    final WebDriver driver; // Instância do WebDriver que será usada para controlar o navegador
    private HomePage homePage; // Objeto que representa a página inicial do sistema (padrão Page Object)
    private ReservePage reservePage; // Objeto que representa a página de reserva de passagens (também segue o padrão Page Object)

    // Construtor
    public ComprarPassagemPO(Base base) {
        this.driver = base.driver;
    }

    // Anotações @Before @After ficam localizados no arquivo Hooks.java

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String url) {
        homePage = new HomePage(driver);
        homePage.acessarHomePage(url);

        // Validar se a guia está correto através do nome da guia
        assertEquals("BlazeDemo", homePage.lerNomeDaGuia());
    }

    @Quando("seleciono a origem {string} e destino {string} PO")
    public void seleciono_a_origem_e_destino_po(String origem, String destino) {
        homePage.selecionarOrigemDestino(origem, destino);

        // ToDo: Na preparação de aula, ajustar sincronismo

    }

    @E("clico no botao Find Flights PO")
    public void clico_no_botao_find_flights_po() {
        homePage.clicarBotaoFindFlights();
        reservePage = new ReservePage(driver); // Chamar a página seguinte
    }

    @Entao("visualiza a lista de voos PO")
    public void visualiza_a_lista_de_voos_po() {
        assertEquals("BlazeDemo - reserve", reservePage.lerNomeDaGuia());
        // ToDo: Comparar a frase origem e destino
    }
}
