package br.com.teste.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.teste.application.model.Conta;
import br.com.teste.application.model.TipoConta;
import br.com.teste.application.service.ContasService;

@Controller
public class ContaController {

	@Autowired
	private ContasService contasService;

	@RequestMapping("/CadastroContas")
	public String listarContas(Model model) {
		model.addAttribute(new Conta());
		model.addAttribute("tipos", TipoConta.values());
		return "cadastrocontas";
	}

	@PostMapping("/CadastroContas")
	public ModelAndView salvar(Conta conta) {
		contasService.salvarConta(conta);
		ModelAndView mv = new ModelAndView("redirect:/CadastroContas");
		mv.addObject("conta", conta);

		return mv;

	}

	@GetMapping("/PesquisarContas")
	public ModelAndView pesquisarContas() {
		ModelAndView mv = new ModelAndView("pesquisacontas");
		mv.addObject("contas", contasService.listarContas());
		return mv;
	}

	@GetMapping("/PesquisarContas/delete/{id}")
	public ModelAndView deletarConta(@PathVariable("id") Long id) {
		contasService.deletarConta(id);
		return pesquisarContas();
	}

}
