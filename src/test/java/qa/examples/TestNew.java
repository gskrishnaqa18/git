package qa.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNew {
    WebDriver driver;
    @Test()
    void test1(){
        System.out.println("Printing test1 Method");

    }
    @Test
    void test2(){
        System.out.println("Printing Test2 Method");
    }

    @Test()
    void test3(){
        System.out.println("Printing test3 Method");
    }
    @Test
    void test4(){
        System.out.println("Printing Test4 Method");
    }
    @Test()
    void test5(){
        System.out.println("Printing test5 Method");
        System.out.println("----------------------");
    }
}
