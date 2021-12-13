package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.orm.Categoria;
import trilha.back.financys.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
@Api("FinancysApplication")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping(path = "/salvar")
    @ApiOperation(value = "Salva a lista de Categorias")
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        return service.createNewCategoria(categoria);
    }


    @GetMapping(path = "/ler")
    @ApiOperation(value = "Retornar a lista de categorias")
    public ResponseEntity<Object> getLista() {

        return ResponseEntity.ok(service.getAllCategoria());
    }

    @GetMapping(path = "ler/{id}")
    public ResponseEntity<Object> getCategoria(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCategoriaById(id));
    }

    @ApiOperation(value = "Altera itens na lista de categorias")
    @PatchMapping(value = "/alterar/{id}")
    public ResponseEntity<Object> updateid(@PathVariable("id") Long id , @RequestBody Categoria categoriaBody){

      service.updateCategoria(id,categoriaBody);

        return ResponseEntity.ok(categoriaBody);

    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Object> categoriaDeletar(@PathVariable("id")Long id){

       service.deleteCategoryById(id);

        return ResponseEntity.noContent().build();
    }
}






