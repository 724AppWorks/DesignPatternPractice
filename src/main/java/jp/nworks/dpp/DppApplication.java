package jp.nworks.dpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DppApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(DppApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(DppApplication.class);
  }

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String index() {
    return "Hello Dpp";
  }

}
