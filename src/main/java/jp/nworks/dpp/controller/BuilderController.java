package jp.nworks.dpp.controller;

import jp.nworks.dpp.service.builder.Director;
import jp.nworks.dpp.service.builder.HTMLBuilder;
import jp.nworks.dpp.service.builder.TextBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/builder")
public class BuilderController {

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String defaultIndex(){
    return textIndex();
  }

  @RequestMapping(value = "/text", method = RequestMethod.GET)
  public String textIndex(){
    String result = "";
    TextBuilder builder = new TextBuilder();
    Director director = new Director(builder);
    result = director.construct();
    return result;
  }

  @RequestMapping(value = "/html", method = RequestMethod.GET)
  public String htmlIndex(){
    String result = "";
    HTMLBuilder builder = new HTMLBuilder();
    Director director = new Director(builder);
    result = director.construct();
    return result;
  }
}
