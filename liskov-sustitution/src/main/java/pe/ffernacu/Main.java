package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.ffernacu.service.Provider;
import pe.ffernacu.service.Taller;
import pe.ffernacu.service.Tienda;

/**
 * La sustitucion de liskov define mediante la herencia que las clases subtipo puedes ser reemplazadas por sus clases base sin alterar su funcionamiento
 * Herencia: extender el comportamiento de la clase Padre hacia las clases hijas
 * Comportamiento: metodos y propiedades
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(Main.class);

    private Provider provider;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        provider = new Tienda();
        var value = provider.recepcionPagos(10.0);
        log.info("{}", value);

        provider = new Taller();
        var value2 = provider.recepcionPagos(5.0);
        log.info("{}", value2);
    }
}