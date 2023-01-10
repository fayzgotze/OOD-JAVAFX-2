import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 /*Fayz Muminov
19897760
admin
CSE3OAD
 */

/**
 * Marks the field as NotNull : a null value is not allowed.
 */
@Retention(RetentionPolicy.RUNTIME)
// Process this annotation at runtime

@Target(ElementType.FIELD)
// This is an annotation on a field (attribute)

public @interface NotNull {
}