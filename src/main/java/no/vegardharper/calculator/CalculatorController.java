package no.vegardharper.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

	@Autowired
	Calculator calculator;


	@RequestMapping("sum")
	public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}

	@RequestMapping("subtract")
	public String subtract(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(calculator.subtract(a, b));
	}

}
