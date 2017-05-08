package jp.nworks.dpp.service.prototype.framework;

public class UnderlinePen implements Product {
  private String ulstr;

  public UnderlinePen(String ulstr) {
    this.ulstr = ulstr;
  }

  @Override
  public String use(String s) {
    String result = "";
    int length = s.getBytes().length;
    result += "\"" + s + "\"";
    result += " ";
    for (int i = 0; i < length; i++) {
      result += ulstr;
    }
    return result;
  }

  @Override
  public Product createClone() {
    Product p = null;
    try{
      p = (Product)clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }
}
