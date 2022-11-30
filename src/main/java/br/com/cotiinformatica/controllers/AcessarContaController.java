package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AcessarContaPostDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Acessar Conta de usuário")
@RestController
public class AcessarContaController {

	@ApiOperation("Serviço para autenticação de usuário.")
	@PostMapping("/api/acessar-conta")
	public void post(@RequestBody AcessarContaPostDto dto) {
		// TODO
	}

}
