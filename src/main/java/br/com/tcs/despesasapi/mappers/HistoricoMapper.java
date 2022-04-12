package br.com.tcs.despesasapi.mappers;

import org.springframework.stereotype.Component;

import br.com.tcs.despesasapi.entities.HistoricoEnity;
import br.com.tcs.despesasapi.models.HistoricoModel;

@Component
public class HistoricoMapper extends AbstractMapper<HistoricoEnity, HistoricoModel> {

    @Override
    public HistoricoModel convertToModel(HistoricoEnity entity) {
        HistoricoModel model = modelMapper.map(entity, HistoricoModel.class);
        return model;
    }

    @Override
    public HistoricoEnity convertToEntity(HistoricoModel model) {
        HistoricoEnity post = modelMapper.map(model, HistoricoEnity.class);
        return post;
    }
}
