package trilha.back.financys;


public class Lancamento {

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
    public String toString(){
        return "Id: " + this.getId() + this.getName() + "Description: " + this.getDescription()
                + "Type: " + this.getType() + "Amount: " + this.getAmount() + "Date: " + this.getDate()
                + "Paid: " + this.getPaid() + "CategoryId: " + this.getCategoryid();
    }

}
