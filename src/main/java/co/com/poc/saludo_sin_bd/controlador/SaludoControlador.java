package co.com.poc.saludo_sin_bd.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/V1/")
public class SaludoControlador {

	@GetMapping
	public String saludaAFamilia() {
		return "Hola Familia Ceiba";
	}

}
