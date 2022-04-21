package br.com.tcs.despesasapi.features.historico.adapters.adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.tcs.despesasapi.features.historico.adapters.mappers.HistoricoEntityMapper;
import br.com.tcs.despesasapi.features.historico.domain.adapters.IHistoricoAdapter;
import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;
import br.com.tcs.despesasapi.features.historico.external.jpa.entities.HistoricoEnity;
import br.com.tcs.despesasapi.features.historico.external.jpa.repository.HistoricoJPARepository;

public class HistoricoJpaAdapter implements IHistoricoAdapter{

    private final HistoricoEntityMapper mapper;
    private final HistoricoJPARepository repository;

    @Autowired
    public HistoricoJpaAdapter(HistoricoEntityMapper mapper, HistoricoJPARepository repository){
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<HistoricoModel> findAll() {
        List<HistoricoEnity> entities = repository.findAll();
        return entities.stream().map(e -> mapper.convertToModel(e)).collect(Collectors.toList());
    }

    @Override
    public HistoricoModel save(HistoricoModel model) {
        return mapper.convertToModel(repository.save(mapper.convertFromModel(model)));
    }

    @Override
    public HistoricoModel findById(String id) {
        Optional<HistoricoEnity> entity = repository.findById(id);
        return mapper.convertToModel(entity.orElse(null));
    }

    @Override
    public void deleteById(String id) {
        repository.delete(repository.getById(id));
    }
    
}
