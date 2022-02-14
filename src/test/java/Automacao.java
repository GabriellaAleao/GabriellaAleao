import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automacao {
    @Test
    public void AbrirNavegadores (){
        System.setProperty("webdriver.chorme.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Acessar o site das americanas
        driver.get("https://www.americanas.com.br");

        //Clicar para buscar o produto
        driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/header/div[1]/div[1]/div/div[1]/form/input")).click();

        //Inserir o nome do produto: console ps4
        driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/header/div[1]/div[1]/div/div[1]/form/input")).sendKeys("console ps4", Keys.ENTER);

        //Clique para abrir o produto buscado
        driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/main/div/div[3]/div[3]/div[1]/div/div/a/div[2]")).click();

        //Digitar o cep
        driver.findElement(By.xpath("b//*[@id=\"rsyswpsdk\"]/div/main/div[2]/div[2]/div[2]/form/div[1]/div[1]/input")).sendKeys("759");
        driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/main/div[2]/div[2]/div[3]")).click();

        //Clique para ir a tela de compra
        driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/main/div[2]/div[2]/div[3]/a[1]")).click();


        //Clique no icone "Americanas" para ir tela inicial
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/a[1]")).click();

        //Minha cesta de compras
        driver.findElement(By.xpath("//*[@id=\"root\"]/header/div/a/picture/svg/g/path[3]")).click();

        //Seleciona o produto dentro do cesto
        driver.findElement(By.xpath("//*[@id=\"rsyswpsdk\"]/div/header/div[1]/div[1]/div/div[3]/span/span/svg/path")).click();

    }
}
