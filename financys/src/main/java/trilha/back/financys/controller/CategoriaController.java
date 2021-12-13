package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.repository.CategoriaRepository;
import trilha.back.financys.orm.Categoria;

@RestController
//@ResponseBody
@RequestMapping(value = "/categorias")
@Api("FinancysApplication")
@CrossOrigin(origins = "*")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping(path = "/salvar")
    @ApiOperation(value = "Salva a lista de Categorias")
    public ResponseEntity<Object> save(@RequestBody Categoria categoriaBody) {
        repository.save(categoriaBody);
        return ResponseEntity.created(null).build();
    }

    @GetMapping(path = "/ler")
    @ApiOperation(value = "Retornar a lista de categorias")
    public ResponseEntity<Object> getLista() {

        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(path = "ler/{id}")
    public ResponseEntity<Object> getCategoria(@PathVariable Long id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @ApiOperation(value = "Altera itens na lista de categorias")
    @PatchMapping(value = "/alterar/{id}")
    public ResponseEntity<Object> updateid(@PathVariable("id") Long id , @RequestBody Categoria categoriaBody){

        Categoria aux = repository.findById(id).get();
        aux.setName(categoriaBody.getName());
        aux.setDescription(categoriaBody.getDescription());
        repository.save(aux);

        return ResponseEntity.ok(categoriaBody);

    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Object> categoriaDeletar(@PathVariable("id")Long id){
        //  Categoria categoria = repository.findById(id).orElseThrow();
       //repository.delete(categoria);
       repository.deleteById(id);
//        deleteCategoryById(id);
//         repository.deleteById(id) = Query(delete * from nomeDB.categoria where id = ?)
        return ResponseEntity.noContent().build();
    }
}






