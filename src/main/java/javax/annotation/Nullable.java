package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The Nullable annotation is used to mark a field, parameter or variable that can be null and should be checked before usage.
 */
@Documented
@Retention( RetentionPolicy.RUNTIME )
public @interface Nullable
{
}
