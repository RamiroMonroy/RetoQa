package co.com.choucair.retoQA.stepdefinitions;

import co.com.choucair.retoQA.interaction.AbrirNavegador;
import co.com.choucair.retoQA.model.DatosUsuario;
import co.com.choucair.retoQA.model.Login;
import co.com.choucair.retoQA.model.RangoFechas;
import co.com.choucair.retoQA.questions.ValidarFecha;
import co.com.choucair.retoQA.questions.ValidarFiltro;
import co.com.choucair.retoQA.questions.ValidarLogin;
import co.com.choucair.retoQA.tasks.FiltrarOrden;
import co.com.choucair.retoQA.tasks.FiltrarReporte;
import co.com.choucair.retoQA.tasks.IngresarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.retoQA.util.Constantes.ACTOR;
import static co.com.choucair.retoQA.util.Constantes.CERO;

public class MyDefinitions {

    Login login;

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }

    @Dado("^que el usuario esta en la pagina web$")
    public void queRamiroEstaEnLaPaginaWeb(){
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.on(login));
    }

    @Cuando("^ingresa sus credenciales$")
    public void ingresaSusCredenciales(List<DatosUsuario> datosUsuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.llenar(datosUsuario.get(CERO)));
    }

    @Entonces("^el usuario puede ver el titulo Dashboard (.*)$")
    public void elUsuarioPuedeVerElTituloDashboard(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLogin.esIgual(mensaje)));
    }
    //


    @Dado("^que el usuario se logueo y esta en la pagina principal$")
    public void queElUsuarioSeLogueoYEstaEnLaPaginaPrincipal(List<DatosUsuario> datosUsuario)  {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirNavegador.on(login));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.llenar(datosUsuario.get(CERO)));
    }

    @Cuando("^ingresa al total de ordenes para filtrar por el numero de orden (.*)$")
    public void ingresaAlTotalDeOrdenesParaFiltrarPorElNumeroDeOrden(String numeroOrden)  {
        OnStage.theActorInTheSpotlight().attemptsTo(FiltrarOrden.filtrar(numeroOrden));
    }

    @Entonces("^el usuario puede ver en view el nombre del cliente (.*)$")
    public void elUsuarioPuedeVerEnViewElNombreDelCliente(String cliente) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFiltro.esIgual(cliente)));
    }
    //
    @Cuando("^ingresa a la categoria Reportes para filtrar por fecha el reporte fiscal$")
    public void ingresaALaCategoriaReportesParaFiltrarPorFechaElReporteFiscal(List<RangoFechas> rangoFechas){
        OnStage.theActorInTheSpotlight().attemptsTo(FiltrarReporte.filtrar(rangoFechas.get(CERO)));
    }

    @Entonces("^el usuario puede ver el reporte de una fecha en el rango seleccionado (.*)$")
    public void elUsuarioPuedeVerElReporteDeUnaFechaEnElRangoSeleccionado(String fechaIintermedia)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarFecha.buscar(fechaIintermedia)));
    }


}
