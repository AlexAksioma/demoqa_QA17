package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    HelperStudentForm studentForm;

    public HelperStudentForm getStudentForm() {
        return studentForm;
    }

    public void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("load-extension=C://Tools/5.3.2_0/");
        //options.addArguments("user-data-dir=C://profile");

        wd = new ChromeDriver(options);

        //options = Options()
        //options.add_argument("user-data-dir=C:\\profile")
        //driver = webdriver.Chrome(chrome_options=options)
        //driver.get("https://google.com")

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        studentForm = new HelperStudentForm(wd);

        returnToDemoQA();

    }

    private void returnToDemoQA() {
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)).close();
        wd.switchTo().window(tabs.get(0));
    }


    public void stop() {
        //wd.quit();
    }
}
