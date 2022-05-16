package com.simple.spring.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@Setter
@Getter
public class AnalectsController {
	/*
	 * 2. 화면에 {message:"Hello World"} 라고 출력 됩니다.
	 */
	@GetMapping(value = "/anal/json")
	@ResponseBody
	public Analects AnalectsJson() {
		Analects anal = new Analects();
		anal.setMessage("helloWorld");
		return anal;
	}
	
	
	@Setter
	@Getter
	public static class Analects {
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
}
