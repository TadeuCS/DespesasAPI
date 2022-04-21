package br.com.tcs.despesasapi.features.historico.external.mongo.documents;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class HistoricoDocument {

    @Id
    private Integer codHistorico;
    private String status;
    private Date dataHora;

    public HistoricoDocument(Integer codHistorico, String status, Date dataHora) {
        this.codHistorico = codHistorico;
        this.status = status;
        this.dataHora = dataHora;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "HistoricoDocument [codHistorico=" + codHistorico + ", dataHora=" + dataHora + ", status=" + status
                + "]";
    }

}
