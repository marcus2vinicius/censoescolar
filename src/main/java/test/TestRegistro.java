package test;

import domain.Registro;
import enums.TipoRegistro;

/**
 * Created by marcus on 13/07/16.
 */
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class TestRegistro {
    public static void main(String[] args) {
        Registro r = new Registro(TipoRegistro.TR00, "123");

        Validator validator;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();

        Set<ConstraintViolation<Registro>> constraintViolations = validator.validate(r);
        for (ConstraintViolation<Registro> v : constraintViolations) {
            System.out.println(v.getMessage());
        }
    }
}
