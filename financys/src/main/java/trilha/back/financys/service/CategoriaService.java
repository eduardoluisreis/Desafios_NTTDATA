package trilha.back.financys.service;


import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import trilha.back.financys.Repository.CategoriaRepository;
import trilha.back.financys.exceptions.CategoriaNotFoundException;
import trilha.back.financys.orm.Categoria;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    private Object NotFoundException;

    public Long createNewCategoria(Categoria categoria){
        Categoria categoria1 = new Categoria();

        categoria1.setId(categoria.getId());
        categoria1.setName(categoria.getName());
        categoria1.setDescription(categoria.getDescription());

        categoria1 = categoriaRepository.save(categoria1);

        return categoria1.getId();
    }

    public List<Categoria>getAllCategoria(){
        return categoriaRepository.findAll();
    }

    public Categoria getCategoriaById(Long id){
        Optional<Categoria> requestedCategoria = categoriaRepository.findById(id);
        if (requestedCategoria.isEmpty()){
            throw new CategoriaNotFoundException(String.format("Categoria with id: '%s' not found" , id));
        }
        return requestedCategoria.get();
    }
    @Transactional
    public Categoria updateCategoria(Long id, Categoria categoryToUpdateRequest){
        Optional<Categoria> categoryFromDatabase = categoriaRepository.findById(id);
        if (categoryFromDatabase.isEmpty()){
            throw new CategoriaNotFoundException(String.format("Category with id: '%s' not found" , id));
        }

        Categoria categoryToUpdate = categoryFromDatabase.get();

        categoryToUpdate.setId(categoryToUpdateRequest.getId());
        categoryToUpdate.setName(categoryToUpdateRequest.getName());
        categoryToUpdate.setDescription(categoryToUpdateRequest.getDescription());

        return categoryToUpdate;

    }

    public void deleteCategoryById(Long id) {
        categoriaRepository.deleteById(id);
    }
}
