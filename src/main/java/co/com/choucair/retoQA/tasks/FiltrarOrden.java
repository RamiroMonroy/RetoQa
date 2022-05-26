package co.com.choucair.retoQA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static co.com.choucair.retoQA.userinterfaces.PaginaPrincipal.*;

public class FiltrarOrden implements Task {

    public String numeroOrden;

    public FiltrarOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(VER_ORDENES));
        actor.attemptsTo(Enter.theValue(numeroOrden).into(NUMERO_DE_ORDEN));
        actor.attemptsTo(Click.on(BOTON_FILTRAR));
        actor.attemptsTo(Click.on(VER_ORDEN));
    }

    public static FiltrarOrden filtrar(String numeroOrden){
        return Tasks.instrumented(FiltrarOrden.class,numeroOrden);
    }
}
