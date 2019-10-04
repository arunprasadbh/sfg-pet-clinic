package guru.springframework.sfgpetclinic.controllers;

/*
 * Created by arunabhamidipati on 04/10/2019
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }
}
