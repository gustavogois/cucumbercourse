import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class AprenderCucumber {

    private int counter = 0;

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
    public void queOValorDoContadorÉ(int newValue) {
        this.counter = newValue;
    }

    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(int valueToBeIncremented) {
        this.counter += valueToBeIncremented;
    }

    @Então("o valor do contador será {int}")
    public void oValorDoContadorSerá(int finalValue) {
        assertEquals(finalValue, this.counter);
    }
}
