import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/alugar_filme.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {
}
