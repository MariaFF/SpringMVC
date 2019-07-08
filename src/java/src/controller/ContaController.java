/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.model.Conta;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.model.Pessoa;

/**
 *
 * @author maria
 */
@Controller
@RequestMapping("/conta")
public class ContaController {

    private Conta conta;
    private Pessoa pessoa = new Pessoa();
    
    //mostra o form de cadastro de conta
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@ModelAttribute("pessoa") Pessoa p, Model model) {
        return "/conta/cadastro";
    }

    //faz o submit das informações do form
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String cadastrar(@ModelAttribute("conta") Conta conta, Model model, HttpServletRequest request) {
        ArrayList<Pessoa> pessoas =  (ArrayList<Pessoa>)  request.getSession().getAttribute("pessoas");
        for (int i = 0; i < pessoas.size(); i++) {
            pessoa = pessoas.get(i); 
        }
        ArrayList<Conta> contas = new ArrayList<>();
        if (request.getSession().getAttribute("contas") != null) {
            contas = (ArrayList<Conta>) request.getSession().getAttribute("conta");
        }
        int id = contas.size();
        conta.setId(id + 1);
        conta.setPessoa(pessoa);
        conta.setTipo(request.getParameter("tipo"));
        conta.setSaldo(100.0);
        contas.add(conta);
        model.addAttribute(contas);
        request.getSession().setAttribute("contas", contas);
        return "redirect:/login";
    }
    
    @RequestMapping("listaContas")
    public String listar(Model model,Conta conta, HttpServletRequest request){
        conta = new Conta();
        ArrayList<Conta> contas =  (ArrayList<Conta>)  request.getSession().getAttribute("contas");
        for (int i = 0; i < contas.size(); i++) {
            conta = contas.get(i); 
        }
        System.out.println("aqui esta alguma coisa ou nao " + conta.getTipo());
        model.addAttribute(conta);
        return "/conta/lista";
    }

}
