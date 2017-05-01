package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.factory.Factory;
import jp.nworks.dpp.service.factory.IDCardFactory;
import jp.nworks.dpp.service.factory.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/factory")
public class FactoryController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("tom");
        Product card2 = factory.create("john");
        Product card3 = factory.create("anna");
        String result = "";
        result += "card1 : " + card1.use();
        result += ", card2 : " + card2.use();
        result += ", card3 : " + card3.use();
        return result;
    }
}
