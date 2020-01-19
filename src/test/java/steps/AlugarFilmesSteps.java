package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Movie;
import model.RentNote;
import service.RentService;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AlugarFilmesSteps {

    private Movie movie;
    private RentService rentService = new RentService();
    private RentNote rentNote;

    @Dado("um filme com estoque de {int} unidades")
    public void umFilmeComEstoqueDeUnidades(int stock) {
        this.movie = new Movie();
        movie.setStock(stock);
    }

    @Dado("que o preço do aluguel seja € {int}")
    public void queOPreçoDoAluguelSeja€(int rentPrice) {
        movie.setPrice(rentPrice);
    }

    @Quando("alugar")
    public void alugar() {
        this.rentNote = rentService.rent(movie);
    }

    @Entao("o preço do aluguel será € {int}")
    public void oPreçoDoAluguelSerá€(int rentPrice) {
        assertEquals(rentPrice, this.rentNote.getPrice());
    }

    @Entao("a data de entrega será no dia seguinte")
    public void aDataDeEntregaSeráNoDiaSeguinte() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        LocalDate returnDate = rentNote.getReturnDate();

        assertEquals(tomorrow, returnDate);
    }

    @Entao("o estoque do filme será {int} unidade")
    public void oEstoqueDoFilmeSeráUnidade(int stock) {
        assertEquals(stock, movie.getStock());
    }
}
