package trilha.back.financys.orm;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categoria") //Esta anotação informa ao Sprimg que esta classe é uma entidade, uma classe que será mapeada para uma tabela no BD
@Table(name = "categoria") //Esta anotação permite mudarmos o nome da tabela
public class Categoria {
        //Toda vez que criarmos uma tabela, devemos informar qual é a chave primaria.
    @Id // Esta anotação defini que a variavel abaixo, será especificamente do tipo ID, uma chave primária na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esta anotação faz com que o BD gere automaticamente os id, com base na  "strategy" estrategia  "GenerationType.IDENTITY, ou seja numeros sequenciais unicos.
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    @OneToMany
    List<Lancamento> lancamentos;

    public Categoria() {}

    public Categoria(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setId(Long id) {this.id = id;}

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


    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
