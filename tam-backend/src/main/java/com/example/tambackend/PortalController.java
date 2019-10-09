package com.example.tambackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller zum Abruf der einzelnen html-Seiten mit localhost:8080
@Controller
public class PortalController {


    @RequestMapping(value="/startseite.html")
    public String StartseitePage(){
        return "startseite";
    }

    @RequestMapping(value="/allgInfo.html")
    public String AllgInfoPage(){
        return "allgInfo";
    }

    @RequestMapping(value="/abschlussarbeitsthemen.html")
    public String AbschlussPage(){
        return "abschlussarbeitsthemen";
    }

    @RequestMapping(value="/professoren.html")
    public String ProfessorenPage(){
        return "professoren";
    }

    @RequestMapping(value="/faq.html")
    public String FaqPage(){
        return "faq";
    }

    @RequestMapping(value="/vorschlaege.html")
    public String VorschlaegePage(){
        return "vorschlaege";
    }

}
