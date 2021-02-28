package com.redouan.tutorials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {

	private String response = "hello!";

	@GetMapping
	public String getTest() {
		return response;
	}
}
