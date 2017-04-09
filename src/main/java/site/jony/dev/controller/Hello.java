package site.jony.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by fang on 2017/4/8.
 */
@Controller
//@RequestMapping("/")
public class Hello {
    @RequestMapping(value = "hello", method = GET)
    public String hello() {
        System.err.println("##################################################################");

        return "hello";
    }

    @RequestMapping("home")
    public String home() {
        return "index";
    }
    @RequestMapping("abc.html")
    public String xx() {
        return "hello";
    }
    @RequestMapping("json")
    @ResponseBody
    public Object json() {
        return "{}";
    }

    @RequestMapping("jsonp")
    @ResponseBody
    public String[] jsonp() {
        return new String[]{"a","b","c"};
    }
}
