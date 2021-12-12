package trilha.back.financys.orm;


import javax.persistence.*;

@Entity //Esta anotação informa ao Sprimg que esta classe é uma entidade, uma classe que será mapeada para uma tabela no BD
@Table(name = "lancamentos") //Esta anotação permite mudarmmos o nome da tabela
public class Lancamento {

    @Id  // Esta anotação defini que a variavel abaixo, será especificamente do tipo ID, uma chave primária na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esta anotação faz com que o BD gere automaticamente os id, com base na  "strategy" estrategia  "GenerationType.IDENTITY, ou seja numeros sequenciais unicos.
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String amount;

    @Column(nullable = false)
    private String date;

    @ManyToOne
    Categoria categoryid;

    @Column(nullable = false)
    private boolean paid;

    public Lancamento() {}

    public Lancamento(Long id, String name, String description, String type, String amount, String date, Categoria categoryid, boolean paid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.categoryid = categoryid;
        this.paid = paid;
    }

    public Long getId() {
        return id;
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

    public Categoria getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Categoria categoryid) {
        this.categoryid = categoryid;
    }

    public boolean getPaid() {
        return paid;
    }

    public void isPaid(boolean paid) {
        this.paid = paid;
    }

    public void setId(Long id) {
    }


    @Override
    public String toString() {
        return "Lancamento{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                ", date='" + date + '\'' +
                ", categoryid=" + categoryid +
                ", paid=" + paid +
                '}';
    }
}
