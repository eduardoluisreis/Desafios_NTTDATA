package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.Repository.LancamentoRepository;
import trilha.back.financys.orm.Lancamento;

@RestController
@ResponseBody
@RequestMapping(value = "/lancamentos")
@Api("FinancysApplication")
@CrossOrigin(origins = "*")
public class LancamentoController {

    @Autowired
    private LancamentoRepository repository;

    @PostMapping("/salvar")
    @ApiOperation(value = "Salva a lista de Lancamentos")
    public ResponseEntity<Object> save(@RequestBody Lancamento lancamentoBody){
        repository.save(lancamentoBody);
        return ResponseEntity.created(null).build();
    }

    @GetMapping(path ="/ler")
    @ApiOperation(value = "Retornar a lista de Lancamentos")
    public ResponseEntity<Object> getLista(){

        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(path = "ler/{id}")
    public ResponseEntity<Object> getLancamento(@PathVariable Long id){
        return ResponseEntity.ok(repository.findById(id));
    }

    @ApiOperation(value = "Altera na lista de Lancamentos")
    @PatchMapping(value = "/{id}")
    public ResponseEntity<Object> updateid(@PathVariable("id") Long id , @RequestBody Lancamento lancamentoBody){

        Lancamento aux = repository.findById(id).get();
        aux.setName(lancamentoBody.getName());
        aux.setDescription(lancamentoBody.getDescription());
        repository.save(aux);

        return ResponseEntity.ok(lancamentoBody);
    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Object> lancamentoDeletar(@PathVariable("id")Long id){
        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}
