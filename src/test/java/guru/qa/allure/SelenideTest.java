package guru.qa.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.allure.pages.GithubPage;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;


public class SelenideTest extends TestBase {

    GithubPage githubPage = new GithubPage();

    @Test
    @DisplayName("Проверка Issue (Allure c Listener)")
    @Owner("Evgeniia Nadobnaia")
    @Feature("Issue " + ISSUE_NUMBER + " в репозитории " + REPO)
    @Story("Проверка Issue " + ISSUE_NUMBER)
    @Severity(SeverityLevel.CRITICAL)
    void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        githubPage.openPage()
                .setSearchInput()
                .openRepo()
                .openIssuesTab()
                .checkIssue();

    }
}
