package it.extrasys.jenkinsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CalculatorController {
	@Autowired
	private Calculator calculator;

	// http://localhost:8080/sum?a=1&b=2.
	@RequestMapping("/sum")
	String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}
}
