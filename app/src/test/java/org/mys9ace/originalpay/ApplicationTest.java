package org.mys9ace.originalpay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

  @Test
  public void アプリケーションが起動すること() {
    Application.main(new String[0]);
    assertTrue(true);
  }

  @Test
  public void ビルダーを利用してアプリケーションを取得できること() {
    Application.Builder builder = Application.builder();
    Application application = builder.build();
    assertTrue(true);
  }
}
