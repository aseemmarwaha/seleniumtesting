import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;



public class TestGoogle{

    @Test
    public void userCanSearch(){
        open("http://google.com");

    }
}