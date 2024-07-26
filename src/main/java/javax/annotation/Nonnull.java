package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Nonnull annotation is used to mark a field, parameter or variable must not be null.
 */
@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( { ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD } )
public @interface Nonnull
{
}
