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
}
