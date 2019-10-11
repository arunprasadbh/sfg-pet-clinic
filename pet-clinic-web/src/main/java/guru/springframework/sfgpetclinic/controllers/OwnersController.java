package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by arunabhamidipati on 05/10/2019
 */
@Controller
@RequestMapping("/owners")
public class OwnersController {
    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String ownersLit(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
