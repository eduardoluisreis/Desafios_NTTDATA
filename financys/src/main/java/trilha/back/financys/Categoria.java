package trilha.back.financys;

public class Categoria {

    Long id;
    String name;
    String description;
    
     

    public Categoria() {  //Construtor Vazio
       
    }

    public Categoria(Long id, String name, String description) {  //Construtor Completo
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Override
    public String toString(){
        return "Nome" + this.getName() + "Description" + this.getDescription();
    }

}
