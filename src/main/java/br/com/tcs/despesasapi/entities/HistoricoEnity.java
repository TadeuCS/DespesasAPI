package br.com.tcs.despesasapi.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historico")
public class HistoricoEnity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codHistorico;
    private String status;
    private Date dataHora;

    public HistoricoEnity() {
    }

    public Integer getCodHistorico() {
        return codHistorico;
    }

    public void setCodHistorico(Integer codHistorico) {
        this.codHistorico = codHistorico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "HistoricoEnity [codHistorico=" + codHistorico + ", dataHora=" + dataHora + ", status=" + status + "]";
    }

    

}
