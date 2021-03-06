package no.vegardharper.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@Autowired
	Calculator calculator;


	@RequestMapping("sum")
	@Cacheable("sum")
	public String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}

	@RequestMapping("subtract")
	@Cacheable("subtract")
	public String subtract(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return String.valueOf(calculator.subtract(a, b));
	}

}
