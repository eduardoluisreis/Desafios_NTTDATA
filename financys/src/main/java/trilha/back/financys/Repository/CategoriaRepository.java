package trilha.back.financys.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.orm.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}
