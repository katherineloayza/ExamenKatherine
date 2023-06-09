package pe.edu.idat.dsw1pruebakatherine2;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia lunes = Dia ();
		lunes.setName("lunes");
		lunes.setTraduccion value:"monday";
		dias.put(lunes.getName(),lunes);
		
        Dia viernes = Dia ();
		viernes.setName("viernes");
		viernes.setTraduccion value:"friday";
		viernes.put(viernes.getName(),viernes);

        Dia sabado = Dia ();
		sabado.setName("sabado");
		sabado.setTraduccion value:"friday";
		sabado.put(sabado.getName(),sabado);

        Dia domingo = Dia ();
		domingo.setName("domingo");
		domingo.setTraduccion value:"sunday";
		domingo.put(domingo.getName(),domingo);


		
		

		
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
