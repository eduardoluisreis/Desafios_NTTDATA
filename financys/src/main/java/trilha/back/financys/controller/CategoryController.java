package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.FinancysApplication;
import trilha.back.financys.models.Categoria;

import java.util.ArrayList;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/categorias")
@Api("FinancysApplication")
@CrossOrigin(origins = "*")
public class CategoryController {

    private ArrayList<Categoria> lista = new ArrayList<Categoria>();

    @PostMapping(path = "/salvar")
    @ApiOperation(value = "Salva a lista de Categorias")
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoriaBody) {
        var categoria = new Categoria();

        categoria.setId(categoriaBody.getId());
        categoria.setName(categoriaBody.getName());
        categoria.setDescription(categoriaBody.getDescription());

        lista.add(categoria);

        return ResponseEntity.ok(categoria);
    }

    @GetMapping(path = "/")
    @ApiOperation(value = "Retornar a lista de categorias")
    public ResponseEntity<List<Categoria>> getLista() {

        return ResponseEntity.ok(lista);
    }

    @GetMapping(path = "/{id}")
    public Categoria getCategoriaById(@PathVariable Long id) {
        return getCategoriaById(id);
    }

//    @PatchMapping(value = "/{id}")
//    public void updateCategoria(@PathVariable("id") Long id,@RequestBody Categoria categoriaRequestDto){
//        var idcategoria = Long.valueOf(id - 1).intValue();
//
//        var item = lista.get(idcategoria);

//        item.setId(categoriaBody.getId());
//        item.setName(categoriaBody.getName());
//        item.setDescription(categoriaBody.getDescription());
//
//        return ResponseEntity.ok(categoria);
     //   System.out.println("Teste");
//}

    @PatchMapping(value = "/{id}")
    @ApiOperation(value = "Altera itens na lista de categorias")
    public ResponseEntity<Categoria> updateid(@PathVariable("id") Long id , @RequestBody Categoria categoria){
        var idcategoria = Long.valueOf(id - 1).intValue();
//        var item = lista.get(Integer.parseInt(String.valueOf(id)));
//          item.setName(categoria.getName());
//          item.setDescription(categoria.getDescription());

        return ResponseEntity.ok(categoria);
    }
}






