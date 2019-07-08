/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.model.Pessoa;

/**
 *
 * @author maria
 */
@Controller
public class PessoaController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "pessoa/cadastro";
    }

    @RequestMapping("/persistePessoa")
    public String persistePessoa(Model m, Pessoa p, HttpServletRequest request) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        if (request.getSession().getAttribute("pessoas") != null) {
            pessoas = (ArrayList<Pessoa>) request.getSession().getAttribute("pessoa");
        }
        int id = pessoas.size();
        p.setId(id + 1);
        pessoas.add(p);
        m.addAttribute("pessoa", p);
        request.getSession().setAttribute("pessoas", pessoas);
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
        }
//        return "redirect:/login";
        return "redirect:/conta";
    }
}
