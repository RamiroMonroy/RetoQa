package co.com.choucair.retoQA.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target NOMBRE_USUARIO= Target.the("nombre_usuario").locatedBy("//input[@id='input-username']");
    public static final Target CONTRASENA= Target.the("contrasena").locatedBy("//input[@id='input-password']");
    public static final Target BOTON_ACCESO= Target.the("boton_acceso").locatedBy("//button[@class='btn btn-primary']");
}
