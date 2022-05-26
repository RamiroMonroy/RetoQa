package co.com.choucair.retoQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.retoQA.userinterfaces.PaginaPrincipal.TITULO_PAGINA_PRINCIPAL;

public class ValidarLogin implements Question {

    public String mensaje;

    public ValidarLogin(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return TITULO_PAGINA_PRINCIPAL.resolveFor(actor).getText().equals(mensaje);
    }

    public static ValidarLogin esIgual(String mensaje){
        return new ValidarLogin(mensaje);
    }
}
