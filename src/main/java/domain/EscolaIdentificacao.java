package domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by marcus on 14/07/16.
 */
public class EscolaIdentificacao extends GenericValidator<EscolaIdentificacao>{
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-3]", message = "1 - em atividade; 2 - paralisada; 3 - extinta")
    private String situacaofuncionamento;
    @Length(max = 10, min = 10)
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)")
    private String dataInicioAanoLetivo;
    @Length(max = 10, min = 10)
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)")
    private String dataTerminoAnoLetivo;
    @NotNull
    @NotEmpty
    @Length(max = 100)
    @Pattern(regexp = "^[A-Z ]*$")
    private String nomeEscola;
    @Length(max = 20)
    @Pattern(regexp = "^[0-9.-]*$")
    private String latitude;
    @Length(max = 20)
    @Pattern(regexp = "^[0-9.-]*$")
    private String longitude;
    @NotNull
    @NotEmpty
    @Length(max = 8, min = 8)
    @Pattern(regexp = "^[0-9]*$")
    private String cep;
    @NotNull
    @NotEmpty
    @Length(max = 100)
    @Pattern(regexp = "[0-9 A-Z的./,-]*")
    private String endereco;
    @Length(max = 10)
    @Pattern(regexp = "[0-9 A-Z的./,-]*")
    private String enderecoNumero;
    @Length(max = 20)
    @Pattern(regexp = "[0-9 A-Z的./,-]*")
    private String complemento;
    @Length(max = 50)
    @Pattern(regexp = "[0-9 A-Z的./,-]*")
    private String bairro;
    @NotNull
    @NotEmpty
    @Length(max = 2, min = 2)
    @Pattern(regexp = "^[0-9]")
    private String uf;
    @NotNull
    @NotEmpty
    @Length(max = 7, min = 7)
    @Pattern(regexp = "^[0-9]")
    private String minicipio;
    @NotNull
    @NotEmpty
    @Length(max = 2)
    @Pattern(regexp = "^[0-9]")
    private String distrito;
    @Length(max = 2, min = 2)
    @Pattern(regexp = "^[0-9]")
    private String ddd;
    @Length(max = 9)
    @Pattern(regexp = "^[0-9]")
    private String telefone;
    @Length(max = 8, min = 8)
    @Pattern(regexp = "^[0-9]")
    private String telefonePublico;
    @Length(max = 9)
    @Pattern(regexp = "^[0-9]")
    private String outroTelefone;
    @Length(max = 8, min = 8)
    @Pattern(regexp = "^[0-9]")
    private String fax;
    @Length(max = 50)
    @Email
    private String email;
    @Length(max = 5, min = 5)
    private String codOrgaoRegEnsino;
    @NotNull
    @NotEmpty
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-4]")
    private String dependenciaAdministrativa;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-2]")
    private String localizacaoZonaEscola;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-4]")
    private String categoriaEscolaPrivada;
    @Length(max = 1, min = 1)
    @Pattern(regexp = "^[1-3]")
    private String conveniadaPoderPublico;
}
