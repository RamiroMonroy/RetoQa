package co.com.choucair.retoQA.tasks;

import co.com.choucair.retoQA.model.DatosUsuario;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.retoQA.userinterfaces.LoginPage.*;

public class IngresarDatos implements Task {

    DatosUsuario datosUsuario;

    public IngresarDatos(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosUsuario.getUsuario()).into(NOMBRE_USUARIO));
        actor.attemptsTo(Enter.theValue(datosUsuario.getContrasena()).into(CONTRASENA));
        actor.attemptsTo(Click.on(BOTON_ACCESO));
    }

    public static IngresarDatos llenar(DatosUsuario datosUsuario){
        return Tasks.instrumented(IngresarDatos.class,datosUsuario);
    }
}
