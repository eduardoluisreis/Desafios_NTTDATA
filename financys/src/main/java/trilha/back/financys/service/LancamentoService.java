package trilha.back.financys.service;


import org.springframework.beans.factory.annotation.Autowired;
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

    public Long createNewLancamento(Lancamento lancamento) {
        Lancamento lancamento1 = new Lancamento();

        lancamento1.setId(lancamento.getId());
        lancamento1.setName(lancamento.getName());
        lancamento1.setDescription(lancamento.getDescription());
        lancamento1.setType(lancamento.getType());
        lancamento1.setAmount(lancamento.getAmount());
        lancamento1.setDate(lancamento.getDate());
        lancamento1.isPago(lancamento.getPago());
        lancamento1.setCategoryid(lancamento.getCategoryid());

        lancamento1 = lancamentoRepository.save(lancamento1);

        return lancamento1.getId();
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

    @Transactional
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
        lancamentoToUpdate.isPago(lancamentoToUpdateRequest.getPago());
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
