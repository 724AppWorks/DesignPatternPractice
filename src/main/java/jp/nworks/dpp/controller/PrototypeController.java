package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.prototype.framework.Manager;
import jp.nworks.dpp.service.prototype.framework.MessageBox;
import jp.nworks.dpp.service.prototype.framework.Product;
import jp.nworks.dpp.service.prototype.framework.UnderlinePen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/prototype")
public class PrototypeController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String index(){
    String result = "";
    Manager manager = new Manager();
    UnderlinePen upen = new UnderlinePen("-");
    MessageBox mbox = new MessageBox("*");
    MessageBox sbox = new MessageBox("/");

    manager.register("strong message", upen);
    manager.register("warning message", mbox);
    manager.register("slash message", sbox);

    Product p1 = manager.create("strong message");
    result += p1.use("Hello world");
    Product p2 = manager.create("warning message");
    result += p2.use("Hello world");
    Product p3 = manager.create("slash message");
    result += p3.use("Hello world");

    return result;
  }
}
