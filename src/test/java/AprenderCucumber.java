import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {

    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Quando("executá-lo")
    public void executáLo() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Então("a especificação deve finalizar com sucesso")
    public void aEspecificaçãoDeveFinalizarComSucesso() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorÉ(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("o valor do contador será {int}")
    public void oValorDoContadorSerá(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
