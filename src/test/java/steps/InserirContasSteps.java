package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class InserirContasSteps {

    ChromeDriver chromeDriver;

    @Dado("que estou acessando a aplicação")
    public void queEstouAcessandoAAplicação() {
        System.setProperty("webdriver.chrome.driver", "/Users/gustavogois/projetos/cucumbercourse/src/test/resources/drivers/chromedriver");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://srbarriga.herokuapp.com");
    }

    @Quando("informo o usuário {string}")
    public void informoOUsuário(String user) {
        chromeDriver.findElement(By.id("email")).sendKeys(user);
    }

    @Quando("a senha {string}")
    public void aSenha(String password) {
        chromeDriver.findElement(By.name("senha")).sendKeys(password);
    }

    @Quando("seleciono entrar")
    public void selecionoEntrar() {
        chromeDriver.findElement(By.tagName("button")).click();
    }

    @Então("visualizo a página inicial")
    public void visualizoAPáginaInicial() {
        String text = chromeDriver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        assertEquals("Bem vindo, Gustavo!", text);
    }

    @Quando("seleciono Contas")
    public void selecionoContas() {

    }

    @Quando("seleciono Adicionar")
    public void selecionoAdicionar() {

    }

    @Quando("informo a conta {string}")
    public void informoAConta(String string) {

    }

    @Quando("seleciono Salvar")
    public void selecionoSalvar() {

    }

    @Então("a conta é inserida com sucesso")
    public void aContaÉInseridaComSucesso() {

    }

}
