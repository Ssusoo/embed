package ms.ssu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * localhost:8080/spring
 */
@RestController
public class SpringController {

	@GetMapping("/spring")
	public String spring() {
		System.out.println("SpringController.spring");
		return "welcome-spring";
	}
}