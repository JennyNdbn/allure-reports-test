package guru.qa.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest extends TestBase {

    @Test
    @DisplayName("Проверка Issue (Allure c Annotated Steps)")
    @Owner("Evgeniia Nadobnaia")
    @Feature("Issue " + ISSUE_NUMBER + " в репозитории " + REPO)
    @Story("Проверка Issue " + ISSUE_NUMBER)
    @Severity(SeverityLevel.CRITICAL)
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();
        steps.openMainPage()
                .searchForRepository(REPO)
                .clickOnRepositoryLink(REPO)
                .openIssuesTab()
                .shouldSeeIssueWithText(TEXT);

    }
}
