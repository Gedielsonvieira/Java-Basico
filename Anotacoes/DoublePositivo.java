import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Essa anotação só é valida em cima de um atributo
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoublePositivo {
}
