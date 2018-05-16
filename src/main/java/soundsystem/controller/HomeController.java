package soundsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhaojiaojiao on 5/11/18.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = "/arrive", method = RequestMethod.GET)
    public String arrive() {
        return "arrive home";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String input(@RequestParam("name")String name) {
        if (name.equals("jiaojiao")) {
            return "it's me";
        }
        else {
            return "it's you";
        }
    }
}
