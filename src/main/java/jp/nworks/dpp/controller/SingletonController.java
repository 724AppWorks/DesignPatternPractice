package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.singleton.Singleton;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/singleton")
public class SingletonController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String index(){
    Singleton singleton = Singleton.getInstance();

    return singleton.getValue();
  }
}
