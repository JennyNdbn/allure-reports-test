package guru.qa.allure;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.allure.pages.GithubPage;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LambdaStepsTest extends TestBase {

    GithubPage githubPage = new GithubPage();

    @Test
    @DisplayName("Проверка Issue (Allure c Lambda Steps)")
    @Owner("Evgeniia Nadobnaia")
    @Feature("Issue " + ISSUE_NUMBER + " в репозитории " + REPO)
    @Story("Проверка Issue " + ISSUE_NUMBER)
    @Severity(SeverityLevel.CRITICAL)
    void testIssueSearchWithLambdaSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем главную страницу", () -> {
            githubPage.openPage();
        });

        step("Ищем репозиторий " + REPO, () -> {
            githubPage.setSearchInput();
        });

        step("Кликаем по ссылке репозитория " + REPO, () -> {
            githubPage.openRepo();
        });

        step("Открываем таб Issues ", () -> {
            githubPage.openIssuesTab();
        });

        step("Проверяем наличие Issue с текстом «" + TEXT + "»", () -> {
            githubPage.checkIssue();
        });
    }
}
