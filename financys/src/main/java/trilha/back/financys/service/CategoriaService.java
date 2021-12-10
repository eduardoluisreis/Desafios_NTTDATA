package trilha.back.financys.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import trilha.back.financys.repository.CategoriaRepository;
import trilha.back.financys.exceptions.CategoriaNotFoundException;
import trilha.back.financys.orm.Categoria;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;
    @Autowired
    private CategoriaRepository cataRepository;
    //private Object NotFoundException;

    public Long createNewCategoria(Categoria categoria){
        Categoria categoria1 = new Categoria();

        categoria1.setId(categoria.getId());
        categoria1.setName(categoria.getName());
        categoria1.setDescription(categoria.getDescription());

        categoria1 = repository.save(categoria1);

        return categoria1.getId();
    }

    public List<Categoria>getAllCategoria(){
        return repository.findAll();
    }

    public Categoria getCategoriaById(Long id){
        Optional<Categoria> requestedCategoria = repository.findById(id);
        if (requestedCategoria.isEmpty()){
            throw new CategoriaNotFoundException(String.format("Categoria with id: '%s' not found" , id));
        }
        return requestedCategoria.get();
    }
    @Transactional
    public Categoria updateCategoria(Long id, Categoria categoryToUpdateRequest){
        Optional<Categoria> categoryFromDatabase = repository.findById(id);
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
        repository.deleteById(id);
    }
}
