package  org.aseem.tests;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;



public class TestGoogle{

    @BeforeAll
    public void setUpRemoteDriver(){

    }
    @Test
    void userCanSearch(){
        open("http://google.com");

    }
}