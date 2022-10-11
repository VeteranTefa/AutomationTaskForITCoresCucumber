package steps;

import BasePackage.BaseClass;
import io.cucumber.java.After;

public class Hooks extends BaseClass {

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}
