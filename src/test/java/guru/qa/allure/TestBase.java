package guru.qa.allure;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public final String
            REPO = "selenide/selenide",
            ISSUE_NUMBER = "2130",
            TEXT = "Add conditions oneOfTexts, oneOfExactTexts, oneOfTextsCaseSensitive, oneOfExactTextsCaseSensitive";

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
    }
}
