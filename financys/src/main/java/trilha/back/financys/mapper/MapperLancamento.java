package trilha.back.financys.mapper;

import org.mapstruct.Mapper;
import springfox.documentation.schema.Entry;
import trilha.back.financys.LancamentoDTO.LancamentoDTO;
import trilha.back.financys.orm.Lancamento;

@Mapper(componentModel = "spring")
public interface MapperLancamento {

    Lancamento toModel(LancamentoDTO lancamentoDTO);

    LancamentoDTO toDTO(Lancamento lancamento);
}
