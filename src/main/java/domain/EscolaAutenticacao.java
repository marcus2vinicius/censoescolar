package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by marcus on 13/07/16.
 */
public class EscolaAutenticacao extends GenericValidator<EscolaAutenticacao>{
    @NotNull
    @NotEmpty
    @Length(max = 11, min = 11)
    private String cpfGestor;
    @NotNull
    @NotEmpty
    @Length(max = 100)
    private String nomeDoGestor;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1,message = "1 - Diretor ou 2 - Outro Cargo")
    private String cargoGestor;
    @NotNull
    @NotEmpty
    @Email
    @Length(max = 50)
    private String emailGestor;


    public String getCpfGestor() {
        return cpfGestor;
    }

    public void setCpfGestor(String cpfGestor) {
        this.cpfGestor = cpfGestor;
    }

    public String getNomeDoGestor() {
        return nomeDoGestor;
    }

    public void setNomeDoGestor(String nomeDoGestor) {
        this.nomeDoGestor = nomeDoGestor;
    }

    public String getCargoGestor() {
        return cargoGestor;
    }

    public void setCargoGestor(String cargoGestor) {
        this.cargoGestor = cargoGestor;
    }

    public String getEmailGestor() {
        return emailGestor;
    }

    public void setEmailGestor(String emailGestor) {
        this.emailGestor = emailGestor;
    }
}
