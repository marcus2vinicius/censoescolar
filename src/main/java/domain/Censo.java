package domain;

import javax.validation.constraints.NotNull;

/**
 * Created by marcus on 13/07/16.
 */
public class Censo {
    @NotNull
    private Escola escola;

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
}
