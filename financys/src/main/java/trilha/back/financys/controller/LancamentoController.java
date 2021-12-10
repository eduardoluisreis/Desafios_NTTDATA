package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.repository.LancamentoRepository;
import trilha.back.financys.orm.Lancamento;
import trilha.back.financys.service.LancamentoService;

@RestController
//@ResponseBody
@RequestMapping(value = "/lancamentos")
@Api("FinancysApplication")
@CrossOrigin(origins = "*")
public class LancamentoController {

    @Autowired
    public LancamentoRepository repository;

    @Autowired
    public LancamentoService lancamentoService;

    @PostMapping("/salvar")
    @ApiOperation(value = "Salva a lista de Lancamentos")
    public ResponseEntity<Object> save(@RequestBody Lancamento lancamentoBody){
        if (lancamentoService.validateEntryById(lancamentoBody.getCategoryid()) == true){
            return  ResponseEntity.ok(repository.save(lancamentoBody));
        }else {
            System.out.println("Não existe categoria para este lancamento");
            return ResponseEntity.ok(HttpStatus.OK);
        }
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
