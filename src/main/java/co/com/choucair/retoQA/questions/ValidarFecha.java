package co.com.choucair.retoQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.retoQA.userinterfaces.PaginaPrincipal.*;

public class ValidarFecha implements Question {

    public String fechaIntermedia;

    public ValidarFecha(String fechaIntermedia) {
        this.fechaIntermedia = fechaIntermedia;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return FECHA_INTERMEDIA.of(fechaIntermedia).resolveFor(actor).getText().equals(fechaIntermedia);
    }

    public static ValidarFecha buscar(String fechaIntermedia){
        return new ValidarFecha(fechaIntermedia);
    }
}
