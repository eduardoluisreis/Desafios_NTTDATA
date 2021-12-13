package trilha.back.financys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.orm.Lancamento;
import trilha.back.financys.service.LancamentoService;

@RestController
@RequestMapping(value = "/lancamentos")
@Api("FinancysApplication")
public class LancamentoController {

      @Autowired
    public LancamentoService lancamentoService;

    @PostMapping("/salvar")
    @ApiOperation(value = "Salva a lista de Lancamentos")
    public ResponseEntity<Lancamento> save(@RequestBody Lancamento lancamentoBody){
        return lancamentoService.createNewLancamento(lancamentoBody);

    }

    @GetMapping(path ="/ler")
    @ApiOperation(value = "Retornar a lista de Lancamentos")
    public ResponseEntity<Object> getLista(){

        return ResponseEntity.ok(lancamentoService.getAllLancamento());
    }

    @GetMapping(path = "ler/{id}")
    public ResponseEntity<Object> getLancamento(@PathVariable Long id){
        return ResponseEntity.ok(lancamentoService.getLancamentoById(id));
    }

    @ApiOperation(value = "Altera na lista de Lancamentos")
    @PatchMapping(value = "/{id}")
    public ResponseEntity<Object> updateid(@PathVariable("id") Long id , @RequestBody Lancamento lancamentoBody){

        lancamentoService.updateLancamento(id , lancamentoBody);

        return ResponseEntity.ok(lancamentoBody);
    }


    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Object> lancamentoDeletar(@PathVariable("id")Long id){
        lancamentoService.deleteEntryById(id);

        return ResponseEntity.noContent().build();
    }

}
