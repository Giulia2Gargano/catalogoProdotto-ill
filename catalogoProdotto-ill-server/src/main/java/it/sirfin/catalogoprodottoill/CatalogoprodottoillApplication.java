package it.sirfin.catalogoprodottoill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// Dice a Spring dove cercare i vari componenti da iniettare con @Autowired
@ComponentScan(basePackages = {"it.sirfin.catalogoprodottoill"})
// Dice a Spring di usare i repository JPA e dove trovarli
@EnableJpaRepositories(basePackages = {"it.sirfin.catalogoprodottoill.repository"})
// Dice a Spring dove trovare le entità
@EntityScan(basePackages = {"it.sirfin.catalogoprodottoill.model"})
public class CatalogoprodottoillApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogoprodottoillApplication.class, args);
    }

}
