package trilha.back.financys.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import trilha.back.financys.repository.CategoriaRepository;
import trilha.back.financys.repository.LancamentoRepository;
import trilha.back.financys.exceptions.LancamentoNotFoundException;
import trilha.back.financys.orm.Categoria;
import trilha.back.financys.orm.Lancamento;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class LancamentoService {
    @Autowired
    private LancamentoRepository lancamentoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    //private Object NotFoundException;

    public ResponseEntity<Lancamento> createNewLancamento(Lancamento lancamento) {
        if (validateEntryById(lancamento.getCategoryid())){
            return  ResponseEntity.ok(lancamentoRepository.save(lancamento));
        }else {
            System.out.println("Não existe categoria para este lancamento");
            return ResponseEntity.badRequest().build();
        }
    }

    public List<Lancamento> getAllLancamento() {

        return lancamentoRepository.findAll();
    }

    public Lancamento getLancamentoById(Long id) {
        Optional<Lancamento> requestedLancamento = lancamentoRepository.findById(id);
        if (requestedLancamento.isEmpty()) {
            throw new LancamentoNotFoundException(String.format("Lancamento with id: '%s' not found" , id));

        }

        return requestedLancamento.get();
    }


    public Lancamento updateLancamento(Long id, Lancamento lancamentoToUpdateRequest){
        Optional<Lancamento> lancamentoFromDatabase = lancamentoRepository.findById(id);
        if (lancamentoFromDatabase.isEmpty()){
            throw new LancamentoNotFoundException(String.format("Lancamento with id: '%s' not found" , id));
        }

        Lancamento lancamentoToUpdate = lancamentoFromDatabase.get();

        lancamentoToUpdate.setId(lancamentoToUpdateRequest.getId());
        lancamentoToUpdate.setName(lancamentoToUpdateRequest.getName());
        lancamentoToUpdate.setDescription(lancamentoToUpdateRequest.getDescription());
        lancamentoToUpdate.setType(lancamentoToUpdateRequest.getType());
        lancamentoToUpdate.setAmount(lancamentoToUpdateRequest.getAmount());
        lancamentoToUpdate.setDate(lancamentoToUpdateRequest.getDate());
        lancamentoToUpdate.isPaid(lancamentoToUpdateRequest.getPaid());
        lancamentoToUpdate.setCategoryid(lancamentoToUpdateRequest.getCategoryid());


        return lancamentoToUpdate;

    }

    public void deleteEntryById(Long id) {
        lancamentoRepository.deleteById(id);
    }

    public boolean validateEntryById(Categoria categoriaId)  {

            Optional<Categoria> categoryId = categoriaRepository.findById(categoriaId.getId());
            if (categoryId.isPresent()) {
                return true;
            }else

                return false;
    }
}
