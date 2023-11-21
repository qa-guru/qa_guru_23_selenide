import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TableTest {


  @Test
  void tableShouldBeFilled() {

    new TableInsurance().getTariff().shouldHave(CollectionCondition.texts("18,99 $", "25,99$"));
  }


  @Test
  void collections() {

    var coll = $$("");

    coll.shouldHave(CollectionCondition.size(10));
    coll.shouldHave(CollectionCondition.texts("The end."));

    var coll2 = coll.snapshot();

    coll.shouldHave(CollectionCondition.allMatch("asc", e -> e.getAttribute("abc").startsWith("1")));

  }

  @Test
  void searchElementToClick() {

    //$("").shouldHave(exactText("Confirm")).click();

    $(byText("Confirm")).click();
    $(withText("Confirm")).click();
  }

  @Test
  void dodoTest() {
    open("https://dodobrands.io/");
    if ($(".c-header__languages .c-toggle__item:not(.c-toggle__item--active)")
            .getText().equals(String.valueOf("EN"))) ;

    $(".c-header__languages .c-toggle__item:not(.c-toggle__item--active)").shouldHave(text("EN"));

    //$$("span").findBy(text("RU")).click(ClickOptions.usingJavaScript());

    executeJavaScript("", "");

  }
}
