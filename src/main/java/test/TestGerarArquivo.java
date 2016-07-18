package test;

import domain.EscolaAutenticacao;
import domain.Censo;
import domain.Escola;
import domain.EscolaIdentificacao;
import utils.GerarArquivoCenso;

/**
 * Created by marcus on 13/07/16.
 */
public class TestGerarArquivo {
    public static void main(String[] args) {
        Censo censo = new Censo();
        Escola e = new Escola("12345678");
        EscolaAutenticacao escolaAutenticacao = new EscolaAutenticacao();
        escolaAutenticacao.setCargoGestor("1");
        escolaAutenticacao.setCpfGestor("12345667892");
        escolaAutenticacao.setEmailGestor("marcus@hotmail.com");
        escolaAutenticacao.setNomeDoGestor("Marcus Vinicius");
        e.setEscolaAutenticacao(escolaAutenticacao);
        EscolaIdentificacao escolaIdentificacao = new EscolaIdentificacao();
        e.setEscolaIdentificacao(escolaIdentificacao);
        censo.setEscola(e);
        String arquivoString="";
        try {
             arquivoString = GerarArquivoCenso.gerar(censo);

        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(arquivoString);
    }
}
