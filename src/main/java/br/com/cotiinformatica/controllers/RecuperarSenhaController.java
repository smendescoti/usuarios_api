package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.RecuperarSenhaPostDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Recuperação de senha de usuário")
@RestController
public class RecuperarSenhaController {

	@ApiOperation("Serviço para recuperação de senha de usuário.")
	@PostMapping("/api/recuperar-senha")
	public void post(@RequestBody RecuperarSenhaPostDto dto) {
		// TODO
	}
}
