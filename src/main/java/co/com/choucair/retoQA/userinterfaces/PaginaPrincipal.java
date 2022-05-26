package co.com.choucair.retoQA.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {
    public static final Target TITULO_PAGINA_PRINCIPAL= Target.the("titulo_pagina_principal").locatedBy("//h1[contains(text(),'Dashboard')]");
    public static final Target VER_ORDENES= Target.the("ver_ordenes").locatedBy("//div[@id='container']/div/div[2]/div/div/div/div[3]/a");
    public static final Target NUMERO_DE_ORDEN= Target.the("numero_de_orden").locatedBy("//input[@id='input-order-id']");
    public static final Target BOTON_FILTRAR= Target.the("boton_filtrar").locatedBy("//button[@id='button-filter']");
    public static final Target VER_ORDEN= Target.the("ver_orden").locatedBy("//form[@id='form-order']/table/tbody/tr/td[8]/div/div/a");
    public static final Target NOMBRE_CLIENTE= Target.the("nombre_cliente").locatedBy("//div[@id='content']/div[2]/div/div[2]/div/table/tbody/tr/td[2]/a");
    public static final Target REPORTES= Target.the("reportes").locatedBy("//li[@id='menu-report']");
    public static final Target VER_REPORTES= Target.the("ver_reportes").locatedBy("//li[@id='menu-report']/ul/li/a");
    public static final Target SELECT_TIPO_REPORTES= Target.the("select_tipo_reportes").locatedBy("//select[@name='report']");
    public static final Target FECHA_INICIAL= Target.the("fecha_inicial").locatedBy("//input[@name='filter_date_start']");
    public static final Target FECHA_FINAL= Target.the("fecha_final").locatedBy("//input[@name='filter_date_end']");
    public static final Target FECHA_INTERMEDIA= Target.the("fecha_intermedia").locatedBy("//td[contains(text(),'{0}')]");
}
