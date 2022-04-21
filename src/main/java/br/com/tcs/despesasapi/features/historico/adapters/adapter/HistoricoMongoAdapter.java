package br.com.tcs.despesasapi.features.historico.adapters.adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.tcs.despesasapi.features.historico.adapters.mappers.HistoricoDocumentMapper;
import br.com.tcs.despesasapi.features.historico.domain.adapters.IHistoricoAdapter;
import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;
import br.com.tcs.despesasapi.features.historico.external.mongo.documents.HistoricoDocument;
import br.com.tcs.despesasapi.features.historico.external.mongo.repository.HistoricoMongoRepository;

public class HistoricoMongoAdapter implements IHistoricoAdapter{

    private final HistoricoDocumentMapper mapper;
    private final HistoricoMongoRepository repository;

    @Autowired
    public HistoricoMongoAdapter(HistoricoDocumentMapper mapper, HistoricoMongoRepository repository){
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<HistoricoModel> findAll() {
        List<HistoricoDocument> entities = repository.findAll();
        return entities.stream().map(e -> mapper.convertToModel(e)).collect(Collectors.toList());
    }

    @Override
    public HistoricoModel save(HistoricoModel model) {
        return mapper.convertToModel(repository.save(mapper.convertFromModel(model)));
    }

    @Override
    public HistoricoModel findById(String id) {
        Optional<HistoricoDocument> document = repository.findById(id);
        return mapper.convertToModel(document.orElse(null));
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);;
    }
    
}
