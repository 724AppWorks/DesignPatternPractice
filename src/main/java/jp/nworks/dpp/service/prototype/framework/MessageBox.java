package jp.nworks.dpp.service.prototype.framework;

public class MessageBox implements Product {
  private String decostr;

  public MessageBox(String decostr) {
    this.decostr = decostr;
  }

  @Override
  public String use(String s) {
    String result = "";
    int length = s.getBytes().length;
    for(int i = 0; i < length; i++){
      result += decostr;
    }
    result += " " + s + " ";
    for(int i = 0; i < length; i++){
      result += decostr;
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
