package br.com.tcs.despesasapi.models;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoricoModel {

    @JsonProperty("id")
    private Integer codigo;

    @NotNull(message = "O atributo \"status\" não pode ser null")
    @JsonProperty("status")
    private String status;
    @JsonProperty("data_hora")
    private Date data;

    public HistoricoModel(){}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HistoricoModel [codigo=" + codigo + ", data=" + data + ", status=" + status + "]";
    }

}
