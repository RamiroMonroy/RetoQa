package co.com.choucair.retoQA.interaction;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Interaction {
    private PageObject pagina;

    public AbrirNavegador(PageObject pagina){this.pagina=pagina;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina));
    }

public static AbrirNavegador on(PageObject pagina){
        return Tasks.instrumented(AbrirNavegador.class,pagina);
}
}
