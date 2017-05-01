package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.templateMethod.AbstractDisplay;
import jp.nworks.dpp.service.templateMethod.CharDisplay;
import jp.nworks.dpp.service.templateMethod.StringDisplay;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/template")
public class TemplateMethodController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        String result = "";
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");

        result += d1.display();
        result += " : ";
        result += d2.display();

        return result;
    }
}
