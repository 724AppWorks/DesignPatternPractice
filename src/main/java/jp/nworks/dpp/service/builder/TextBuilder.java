package jp.nworks.dpp.service.builder;

public class TextBuilder extends Builder {

  private StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    buffer.append("[ " + title + " ]");
  }

  @Override
  public void makeString(String string) {
    buffer.append("■" + string + " : ");
  }

  @Override
  public void makeItems(String[] items) {
    for (String item : items) {
      buffer.append("{" + item + "}");
    }
  }

  @Override
  public String close() {
    return buffer.toString();
  }
}
