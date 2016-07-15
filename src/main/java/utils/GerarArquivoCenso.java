package utils;

import domain.*;

import javax.validation.ConstraintViolation;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by marcus on 13/07/16.
 */
public class GerarArquivoCenso {
    private static String del = "|";

    public static String gerar(Censo censo) throws Exception {
        String todos = "";
        String registro00 = gerarRegistro00(censo);
        todos += registro00;
        return todos;
    }

    private static String gerarRegistro00(Censo censo) throws Exception {
        validaRegistro00(censo.getEscola());
        String linha = "";
        linha = censo.getEscola().getRegistro().getTipo()              + del;//seq1
        linha += censo.getEscola().getRegistro().getCodigoEscolaInep() + del;//seq2
        //EscolaAutenticacao
        linha += censo.getEscola().getEscolaAutenticacao().getCpfGestor()    + del;//seq3
        linha += censo.getEscola().getEscolaAutenticacao().getNomeDoGestor() + del;//seq4
        linha += censo.getEscola().getEscolaAutenticacao().getCargoGestor()  + del;//seq5
        linha += censo.getEscola().getEscolaAutenticacao().getEmailGestor()  + del;//seq6
        return linha;
    }

    private static void validaRegistro00(Escola escola) throws Exception {
        Set<ConstraintViolation<Escola>> errosEscola = escola.valida();
        Set<ConstraintViolation<EscolaAutenticacao>> errosAutenticao = escola.getEscolaAutenticacao().valida();
        Set<ConstraintViolation<Registro>> errosRegistro = escola.getRegistro().valida();
        Set<ConstraintViolation<EscolaIdentificacao>> errosIdentificacao = escola.getEscolaIdentificacao().valida();

        String msg = "";
        msg += errosEscola.stream().map(i-> i.getPropertyPath()+": "+i.getMessage()).collect(Collectors.joining("\n"));
        msg += errosAutenticao.stream().map(i-> i.getPropertyPath()+": "+i.getMessage()).collect(Collectors.joining("\n"));
        msg += errosRegistro.stream().map(i-> i.getPropertyPath()+": "+i.getMessage()).collect(Collectors.joining("\n"));
        msg += errosIdentificacao.stream().map(i-> i.getPropertyPath()+": "+i.getMessage()).collect(Collectors.joining("\n"));

        if(msg!=null && !msg.isEmpty())
            throw new Exception(msg);
    }

}
