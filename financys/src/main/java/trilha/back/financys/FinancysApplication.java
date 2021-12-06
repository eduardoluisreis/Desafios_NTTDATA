package trilha.back.financys;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import trilha.back.financys.Repository.CategoriaRepository;


@EntityScan  (basePackages = ("trilha.back.financys.orm"))
@EnableJpaRepositories (basePackages = ("trilha.back.financys.Repository"))
@ComponentScan (basePackages = ("trilha.back.financys.controller, trilha.back.financys.models"))
@SpringBootApplication
@Component
public class FinancysApplication implements CommandLineRunner {
    private CategoriaRepository repository;

    public FinancysApplication(CategoriaRepository repository){
        this.repository = repository;
    }

	public static void main(String[] args) {
        SpringApplication.run(FinancysApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
