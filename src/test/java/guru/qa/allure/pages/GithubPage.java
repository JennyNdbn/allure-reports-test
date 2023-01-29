package guru.qa.allure.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class GithubPage {
    private final String SELENIDE = "selenide",
            REPO = "selenide/selenide",
            ISSUE_NUMBER = "2130",
            TEXT = "Add conditions oneOfTexts, oneOfExactTexts, oneOfTextsCaseSensitive, oneOfExactTextsCaseSensitive";

    private final SelenideElement
            searchInput = $("[name=q]"),
            repoList = $(".repo-list"),
            issuesTab = $("#issues-tab"),
            issue = $("#issue_" + ISSUE_NUMBER + "_link");

    public GithubPage openPage() {
        open(baseUrl);
        return this;
    }
    public GithubPage setSearchInput(){
        searchInput.setValue(SELENIDE).pressEnter();
        return this;
    }
    public GithubPage openRepo(){
        repoList.shouldHave(text(REPO));
        $(linkText(REPO)).click();
        return this;
    }
    public GithubPage openIssuesTab(){
        issuesTab.click();
        return this;
    }
    public GithubPage checkIssue(){
        issue.shouldHave(text(TEXT));
        return this;
    }

}
