package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.adapter.Print;
import jp.nworks.dpp.service.adapter.PrintBanner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/adapter")
public class AdapterController {

    @RequestMapping(value = "")
    public String index(){
        Print p = new PrintBanner("Hello");
        String result = "";
        result += "printweek : " + p.printWeek();
        result += ", printStrong : " + p.pringString();
        return result;
    }
}
