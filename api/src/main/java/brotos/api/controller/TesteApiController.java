package brotos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteApiController {
	
	@GetMapping
	public String testeFuncionamentoApi() {
		return "Parabens ta funcionando";
	}
}
