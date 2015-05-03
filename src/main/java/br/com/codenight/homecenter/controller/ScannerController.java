package main.java.br.com.codenight.homecenter.controller;

import main.java.br.com.codenight.homecenter.model.Scanner;
import main.java.br.com.codenight.homecenter.repository.ScannerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ScannerController {

	private @Autowired ScannerRepository scannerRepository;
	
	@RequestMapping("/scanner")
	@ResponseBody
	public Iterable<Scanner> listAll() {
		return scannerRepository.findAll();
	}
}
