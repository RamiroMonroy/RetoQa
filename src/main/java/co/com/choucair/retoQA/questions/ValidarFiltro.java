package co.com.choucair.retoQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.retoQA.userinterfaces.PaginaPrincipal.NOMBRE_CLIENTE;
import static co.com.choucair.retoQA.userinterfaces.PaginaPrincipal.TITULO_PAGINA_PRINCIPAL;

public class ValidarFiltro implements Question {

    public String cliente;

    public ValidarFiltro(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return NOMBRE_CLIENTE.resolveFor(actor).getText().equals(cliente);
    }

    public static ValidarFiltro esIgual(String cliente){
        return new ValidarFiltro(cliente);
    }
}
