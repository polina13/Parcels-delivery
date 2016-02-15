import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Triangle Types");
  }

  @Test
  public void checkEquilateral() {
      goTo("http://localhost:4567/");
      fill("#sideA").with("2");
      fill("#sideB").with("2");
      fill("#sideC").with("2");
      submit(".btn");
      assertThat(pageSource()).contains("equilateral");
  }

  @Test
  public void checkNotATriangle() {
      goTo("http://localhost:4567/");
      fill("#sideA").with("2");
      fill("#sideB").with("2");
      fill("#sideC").with("8");
      submit(".btn");
      assertThat(pageSource()).contains("That's not a triangle!");
  }
}
