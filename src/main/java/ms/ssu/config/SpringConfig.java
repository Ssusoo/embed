package ms.ssu.config;

import ms.ssu.controller.SpringController;
import org.springframework.context.annotation.Bean;

//@Configuration
public class SpringConfig {
	@Bean
	public SpringController springController() {
		return new SpringController();
	}
}
