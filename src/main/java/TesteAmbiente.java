import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAmbiente {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gustavogois/projetos/cucumbercourse/src/test/resources/drivers/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://srbarriga.herokuapp.com");
    }
}
