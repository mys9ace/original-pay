package org.mys9ace.originalpay;

public class Application {
  private Application(Builder builder) {
  }

  public static void main(String[] args) {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Builder() {
    }

    public Application build() {
      return new Application(this);
    }
  }
}
