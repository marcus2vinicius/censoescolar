package enums;

/**
 * Created by marcus on 13/07/16.
 */
public enum TipoRegistro {
    TR00("00"), TR10("10"), TR20("20"), TR30("30"), TR40("40"), TR50("50"),
    TR51("51"), TR60("60"), TR70(""), TR80("70");

    private final String valor;

    TipoRegistro(String valor)
    {
        this.valor = valor;
    }
    public String getValor(){ return valor; }
}
