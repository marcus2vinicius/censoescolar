package domain;

import enums.TipoRegistro;

import javax.validation.constraints.NotNull;

/**
 * Created by marcus on 13/07/16.
 */
public class Escola extends GenericValidator<Escola> {
    @NotNull
    private Registro registro;
    @NotNull
    private EscolaAutenticacao escolaAutenticacao;
    @NotNull
    private EscolaIdentificacao escolaIdentificacao;

    public Escola(String codigoEscolaInep){
        this.registro = new Registro(TipoRegistro.TR00, codigoEscolaInep);
    }

    public Escola(){
        this.registro = new Registro(TipoRegistro.TR00, null);
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public EscolaAutenticacao getEscolaAutenticacao() {
        return escolaAutenticacao;
    }

    public void setEscolaAutenticacao(EscolaAutenticacao escolaAutenticacao) {
        this.escolaAutenticacao = escolaAutenticacao;
    }

    public EscolaIdentificacao getEscolaIdentificacao() {
        return escolaIdentificacao;
    }

    public void setEscolaIdentificacao(EscolaIdentificacao escolaIdentificacao) {
        this.escolaIdentificacao = escolaIdentificacao;
    }
}
