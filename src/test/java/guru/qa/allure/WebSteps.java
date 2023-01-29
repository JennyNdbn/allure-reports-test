package guru.qa.allure;

import guru.qa.allure.pages.GithubPage;
import io.qameta.allure.*;

public class WebSteps {

    GithubPage githubPage = new GithubPage();

        @Step("Открываем главную страницу")
        public WebSteps openMainPage() {
            githubPage.openPage();
            return this;
        }

        @Step("Ищем репозиторий {repo}")
        public WebSteps searchForRepository(String repo) {
            githubPage.setSearchInput();
            return this;
        }

        @Step("Кликаем по ссылке репозитория {repo}")
        public WebSteps clickOnRepositoryLink(String repo) {
            githubPage.openRepo();
            return this;
        }

        @Step("Открываем таб Issues")
        public WebSteps openIssuesTab() {
            githubPage.openIssuesTab();
            return this;
        }

        @Step("Проверяем наличие Issue с текстом «{text}»")
        public WebSteps shouldSeeIssueWithText(String text) {
            githubPage.checkIssue();
            return this;
        }
}
