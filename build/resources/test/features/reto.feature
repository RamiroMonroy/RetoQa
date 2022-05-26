#Autor: Ramiro Monroy Ramos
#language: es

@HistoriaDeUsuario
  Característica: Probar las funcionalidades de la pagina opencart.com
    Yo como PO quiero validar que la pagina web https://demo.opencart.com/
    solo permite el acceso a usuarios registrados y les permite gestionar las ordenes e informes

  @CasoLogueo
  Esquema del escenario:Validar acceso solo para usuarios registrados
    Dado que el usuario esta en la pagina web
    Cuando ingresa sus credenciales
      | usuario | contrasena |
      |<usuario>|<contrasena>|
    Entonces el usuario puede ver el titulo Dashboard <titulo>

    Ejemplos:
      | usuario | contrasena |  titulo  |
      | demo    |    demo    | Dashboard|
      |democito |  democito  | Dashboard|

  @CasoOrdenes
    Esquema del escenario:Filtrar ordenes por su numero de orden
      Dado que el usuario se logueo y esta en la pagina principal
        | usuario | contrasena |
        |<usuario>|<contrasena>|

      Cuando ingresa al total de ordenes para filtrar por el numero de orden <numeroOrden>

      Entonces el usuario puede ver en view el nombre del cliente <cliente>

      Ejemplos:
        | usuario | contrasena | numeroOrden |  cliente  |
        |  demo   |    demo    |   16405     |Debopam Das|

    @CasoReportes
    Esquema del escenario:Filtrar reportes por fecha en cualquier formato
      Dado que el usuario se logueo y esta en la pagina principal
        | usuario | contrasena |
        |<usuario>|<contrasena>|

      Cuando ingresa a la categoria Reportes para filtrar por fecha el reporte fiscal
        | nombreInforme | fechaInicial | fechaFinal |
        |<nombreInforme>|<fechaInicial>|<fechaFinal>|

      Entonces el usuario puede ver el reporte de una fecha en el rango seleccionado <fechaIntermedia>

      Ejemplos:
        | usuario | contrasena | nombreInforme | fechaInicial | fechaFinal | fechaIntermedia |
        |  demo   |    demo    |  Tax Report   |  2018-01-05  | 2018-31-05 |    13/05/2018   |
        |  demo   |    demo    |  Tax Report   |  2018-05-01  | 2018-05-31 |    13/05/2018   |
        |  demo   |    demo    |  Tax Report   |  01-05-2018  | 31-05-2018 |    13/05/2018   |
        |  demo   |    demo    |  Tax Report   |  05-01-2018  | 05-31-2018 |    13/05/2018   |