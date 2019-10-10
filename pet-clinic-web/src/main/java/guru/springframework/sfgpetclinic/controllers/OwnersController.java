package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by arunabhamidipati on 05/10/2019
 */
@Controller
public class OwnersController {

    @RequestMapping({"owners", "owners/index", "owners/index.html"})
    public String ownersLit(){

        return "owners/index";
    }
}
