package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.iterator.Book;
import jp.nworks.dpp.service.iterator.BookShelf;
import jp.nworks.dpp.service.iterator.Iterator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/iterator")
public class IteratorController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String index() {
    String result = "";
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around"));
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
