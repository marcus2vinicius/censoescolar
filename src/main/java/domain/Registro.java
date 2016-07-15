package domain;

import enums.TipoRegistro;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by marcus on 13/07/16.
 */
public class Registro extends GenericValidator<Registro>{
    @NotNull
    @NotEmpty
    @Length(max = 2,min = 2)
    private String tipo;
    @NotNull
    @NotEmpty
    @Length(max = 8,min = 8)
    private String codigoEscolaInep;


    public Registro(TipoRegistro tipo, String codigoEscolaInep) {
        this.tipo = tipo.getValor();
        this.codigoEscolaInep = codigoEscolaInep;
    }

    public Registro(String tipo, String codigoEscolaInep) {
        this.tipo = tipo;
        this.codigoEscolaInep = codigoEscolaInep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigoEscolaInep() {
        return codigoEscolaInep;
    }

    public void setCodigoEscolaInep(String codigoEscolaInep) {
        this.codigoEscolaInep = codigoEscolaInep;
    }
}
