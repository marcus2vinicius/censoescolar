package domain;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by marcus on 13/07/16.
 */
public class GenericValidator<T> {
    private T me;

    public Set<ConstraintViolation<T>> valida(){
        me = (T) this;
        Validator validator;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        return validator.validate(me);
    }
}
