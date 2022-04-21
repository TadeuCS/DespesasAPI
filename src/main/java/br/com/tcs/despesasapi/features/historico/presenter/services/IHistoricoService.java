package br.com.tcs.despesasapi.features.historico.presenter.services;

import java.util.List;

import br.com.tcs.despesasapi.features.historico.domain.models.HistoricoModel;

public interface IHistoricoService {
    public List<HistoricoModel> findAll() throws Exception;

    public HistoricoModel save(HistoricoModel model) throws Exception;

    public HistoricoModel findOne(String id) throws Exception;

    public void delete(String id) throws Exception;
}
