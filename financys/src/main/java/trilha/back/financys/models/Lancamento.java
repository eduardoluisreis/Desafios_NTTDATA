package trilha.back.financys.models;


import javax.persistence.Id;
import java.util.Objects;

public class Lancamento {

    @Id
    Long id;
    String name;
    String description;
    String type;
    String amount;
    String date;
    boolean paid;
    Long categoryid;
     void status(){
         System.out.println("Nome: " + this.name);
         System.out.println("Descrição: " + this.description);
         System.out.println("Tipo: " + this.type);
         System.out.println("Valor: " + this.amount);
         System.out.println("Data: " + this.date);
         System.out.println("Status: " + this.paid);
              
     }
     
     void pago(){
        if( this.paid == true){
         System.out.println("Lançamento Pago");
       }else{
             System.out.println("Lançamento Pendente");
             }     
     }
     
     void pendente(){
         this.paid = false;
         
     }

     void name(String salario){

     }

    public Lancamento() {  //Construtor Vazio

    }

    public Lancamento(Long id, String name, String description, String type, String amount, String date, boolean paid, Long categoryid) { //Construtor Completo
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryid = categoryid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Long getCategoryid() {
        return categoryid;
    }
    
    public void setCategoryid(Long categoryid){
    
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return paid == that.paid && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(type, that.type) && Objects.equals(amount, that.amount) && Objects.equals(date, that.date) && Objects.equals(categoryid, that.categoryid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type, amount, date, paid, categoryid);
    }

    @Override
    public String toString(){
        return "Id: " + "Name: " + "Description: " + "Type: " + "Amount: "
                + "Date: " + "Paid: " + "CategoryId: ";
    }


}
