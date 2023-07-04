package com.seguranca.oauth2.controller;

import java.util.List;

import com.seguranca.oauth2.model.Cliente;
import com.seguranca.oauth2.repositorio.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listar(){
		return ResponseEntity.ok(repositorio.findAll());
	}
}
