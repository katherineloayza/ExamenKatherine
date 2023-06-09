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
		Country lunes = new Country();
		lunes.setName("lunes");
		lunes.setCapital("Martes");
		lunes.setCurrency(Currency.EUR);
		lunes.setPopulation(46704314);

		countries.put(lunes.getName(), lunes);

		Country martes = new Country();
		martes.setName("martes");
		martes.setCapital("Warsaw");
		martes.setCurrency(Currency.PLN);
		martes.setPopulation(38186860);

		countries.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("miercoles");
		miercoles.setCapital("London");
		miercoles.setCurrency(Currency.GBP);
		miercoles.setPopulation(63705000);

		countries.put(miercoles.getName(), miercoles);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
