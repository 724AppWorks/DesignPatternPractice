package jp.nworks.dpp.service.builder;

public class HTMLBuilder extends Builder {
  private StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    buffer.append("<html><body>");
    buffer.append("<h1>" + title + "</h1><br />");
  }

  @Override
  public void makeString(String string) {
    buffer.append("<h2>■" + string + "</h2><br /><br />");
  }

  @Override
  public void makeItems(String[] items) {
    buffer.append("<ul>");
    for (String item : items) {
      buffer.append("<li>" + item + "</li>");
    }
    buffer.append("</ul>");
  }

  @Override
  public String close() {
    buffer.append("</body></html>");
    return buffer.toString();
  }
}
