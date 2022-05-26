package co.com.choucair.retoQA.tasks;

import co.com.choucair.retoQA.model.RangoFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.retoQA.userinterfaces.PaginaPrincipal.*;

public class FiltrarReporte implements Task {

    public RangoFechas rangoFechas;

    public FiltrarReporte(RangoFechas rangoFechas) {
        this.rangoFechas = rangoFechas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Click.on(REPORTES));
      actor.attemptsTo(Click.on(VER_REPORTES));
      actor.attemptsTo(SelectFromOptions.byVisibleText(rangoFechas.getNombreInforme()).from(SELECT_TIPO_REPORTES));
      actor.attemptsTo(Enter.theValue(rangoFechas.getFechaInicial()).into(FECHA_INICIAL));
      actor.attemptsTo(Enter.theValue(rangoFechas.getFechaFinal()).into(FECHA_FINAL));
      actor.attemptsTo(Click.on(BOTON_FILTRAR));
    }

    public static FiltrarReporte filtrar(RangoFechas rangoFechas){
        return Tasks.instrumented(FiltrarReporte.class,rangoFechas);
    }
}
