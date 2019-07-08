/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import src.model.Conta;
import src.model.Pessoa;

/**
 *
 * @author maria
 */
@Controller
public class UsuarioController {

    private Pessoa pessoa = new Pessoa();
    private Conta conta = new Conta();

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "usuario/login";
    }

    @RequestMapping("usuarioLogin")
    public String logar(Model m, Pessoa p, Conta c, HttpServletRequest request) {
        //HttpSession session = request.getSession();
        //System.out.println("Session" + session);
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) request.getSession().getAttribute("pessoas");
        ArrayList<Conta> contas = (ArrayList<Conta>) request.getSession().getAttribute("contas");
        for (int i = 0; i < pessoas.size(); i++) {
            pessoa = pessoas.get(i);
        }
        for (int i = 0; i < contas.size(); i++) {
            conta = contas.get(i);
        }

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        if (pessoa.getLogin().equals(login) && pessoa.getSenha().equals(senha)) {
            m.addAttribute("pessoa", pessoa);
            m.addAttribute("conta", conta);
            return "usuario/mensagemLogado";
        } else {
            return "redirect:/login";
        }
//        return "/login";
    }

    @RequestMapping("fazerlogoff")
    public String sair(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return "usuario/login";
    }

}
