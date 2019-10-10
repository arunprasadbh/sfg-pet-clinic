package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by arunabhamidipati on 05/10/2019
 */
@Controller
public class VetsController {

    @RequestMapping({"vets", "vets/index", "vets/index.html"})
    public String vetsList(){

        return "vets/index";
    }
}
