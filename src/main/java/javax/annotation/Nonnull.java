package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The Nonnull annotation is used to mark a field, parameter or variable must not be null.
 */
@Documented
@Retention( RetentionPolicy.RUNTIME )
public @interface Nonnull
{
}
