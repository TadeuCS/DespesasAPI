package br.com.tcs.despesasapi.features.historico.adapters.mappers;

import org.springframework.stereotype.Component;

import br.com.tcs.despesasapi.core.utils.AbstractMapper;
import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;
import br.com.tcs.despesasapi.features.historico.external.jpa.entities.HistoricoEnity;

@Component
public class HistoricoEntityMapper extends AbstractMapper<HistoricoEnity, HistoricoModel> {

    @Override
    public HistoricoModel convertToModel(HistoricoEnity entity) {
        HistoricoModel model = modelMapper.map(entity, HistoricoModel.class);
        return model;
    }

    @Override
    public HistoricoEnity convertFromModel(HistoricoModel model) {
        HistoricoEnity post = modelMapper.map(model, HistoricoEnity.class);
        return post;
    }
}
