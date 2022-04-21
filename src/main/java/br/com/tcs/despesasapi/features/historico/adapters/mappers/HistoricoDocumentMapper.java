package br.com.tcs.despesasapi.features.historico.adapters.mappers;

import org.springframework.stereotype.Component;

import br.com.tcs.despesasapi.core.utils.AbstractMapper;
import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;
import br.com.tcs.despesasapi.features.historico.external.mongo.documents.HistoricoDocument;

@Component
public class HistoricoDocumentMapper extends AbstractMapper<HistoricoDocument, HistoricoModel> {

    @Override
    public HistoricoModel convertToModel(HistoricoDocument entity) {
        HistoricoModel model = modelMapper.map(entity, HistoricoModel.class);
        return model;
    }

    @Override
    public HistoricoDocument convertFromModel(HistoricoModel model) {
        return modelMapper.map(model, HistoricoDocument.class);
    }
}
