package trilha.back.financys;


// @SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {

		Lancamento lancamento = new Lancamento();
                lancamento.id = 04L;
                lancamento.name = "Salário";
                lancamento.description = "Adiantamento Quinzenal: ";
                lancamento.type = "Recebimento";
                lancamento.amount = "4500";
                lancamento.date = "31/10/2021";
                lancamento.categoryid = 6L;
                lancamento.pago();
                lancamento.status();               

		Lancamento lancamento2 = new Lancamento();
                
                Categoria categoria = new Categoria();
                categoria.id = 04L;
                categoria.name = "Salário";
                categoria.description = "Recebimento de Salário";
                
                Categoria categoria2 = new Categoria();
                
	}

}