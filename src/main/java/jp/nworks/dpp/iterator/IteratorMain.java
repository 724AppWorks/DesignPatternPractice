package jp.nworks.dpp.iterator;

public class IteratorMain {

  public String index() {
    String result = "";
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Arround"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy"));
    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      if (result != "") {
        result += " : " + book.getName();
      } else {
        result = book.getName();
      }
    }
    return result;
  }
}
