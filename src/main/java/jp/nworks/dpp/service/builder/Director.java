package jp.nworks.dpp.service.builder;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public String construct() {
    String result = "";
    builder.makeTitle("Greeting");
    builder.makeString("Between morning and afternoon");
    builder.makeItems(new String[]{
        "Good Morning"
        ,"Good Afternoon"
    });
    result += builder.close();

    return result;

  }
}
