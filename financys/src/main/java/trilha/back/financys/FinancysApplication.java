package trilha.back.financys;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import trilha.back.financys.models.Categoria;
import trilha.back.financys.models.Lancamento;

@SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {

        SpringApplication.run(FinancysApplication.class, args);

        Lancamento lancamento = new Lancamento();
        lancamento.setId(04L);
        lancamento.setName("Salario");
        lancamento.setDescription("Salario do mes");

        Lancamento lancamento1 = new Lancamento();

//		Lancamento lancamento = new Lancamento();
//                lancamento.id= 04L;
//                lancamento.name = "Salário";
//                lancamento.description = "Adiantamento Quinzenal: ";
//                lancamento.type = "Recebimento";
//                lancamento.amount = "4500";
//                lancamento.date = "31/10/2021";
//                lancamento.categoryid = 5L;
//                lancamento.pago();
//                lancamento.status();
//
//        System.out.printf(lancamento.toString());



        Categoria categoria = new Categoria();
         categoria.setId(04L);
               categoria.setName("Salário");
                categoria.setDescription("Recebimento de Salário");

                Categoria categoria2 = new Categoria();

	}

}