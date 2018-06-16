package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Generated annotation is used to mark source code that has been generated.
 */
@Documented
@Retention( RetentionPolicy.SOURCE )
@Target( { ElementType.PACKAGE,
           ElementType.TYPE,
           ElementType.ANNOTATION_TYPE,
           ElementType.CONSTRUCTOR,
           ElementType.METHOD,
           ElementType.PARAMETER,
           ElementType.FIELD,
           ElementType.LOCAL_VARIABLE } )
public @interface Generated
{
  /**
   * The name of the code generator.
   * This is typically the fully qualified name of the code generator.
   *
   * @return the name of the code generator.
   */
  String[] value();

  /**
   * Return the timestamp when the element was generated.
   * This is not recommended parameter as the Generator will not be a pure function of the inputs.
   * If this is present the value MUST follow the ISO 8601 standard.
   *
   * @return the timestamp when the element was generated.
   */
  String date() default "";

  /**
   * Return additional notes supplied by the Generator.
   *
   * @return additional notes supplied by the Generator.
   */
  String comments() default "";
}

