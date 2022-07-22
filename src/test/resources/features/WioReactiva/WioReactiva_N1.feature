Feature: Solicitud de Pagare Reactiva-N1

  @EscenarioN1_Recepcionista
  Scenario Outline: Estacion Recepcion de Solicitud
    Given Inicializando la pagina de wio
    When ingreso el usuario "<Usuario>"
    And selecciono el "<Perfil>" e Ingresar
    And selecciono MenuWio
    And ingreso a NuevaInstruccionOperativa
    And ingreso CU"<Data>"
    And clic Continuar popup
    And selecciono producto "<Data>" Forma de OperacionA "<Data>" OperacionB "<Data>"
    And selecciono tipo de moneda "<Data>" y escribo el importe "<Data>"
    And guardo el numero de la instruccion del "<Data>"
    And ingreso modulo Doc.Adjuntos
    And clic Grabar y Enviar
  #  And ingreso a Bandeja de Busqueda
  #  And buscar el wio por Nro de Instruccion
  #  And ingresar a la informacion de la instruccion
  #  And ingreso al modulo Seguimiento
  #  And ingreso a Localizar Instruccion
  #  Then validar estacion Elaboracion_de_Instruccion
  #  And cerrar popup Localizar Incidente
  #  And click en cerrar sesion
    Examples:
      | Data | Usuario | Perfil        |
      | 1    | B10988  | Recepcionista |

  @EscenarioN1_AsistenteComercial
  Scenario Outline: Estacion Elaboración Instruccion
    Given Inicializando la pagina de wio
    When ingresar el usuario Elaboracion Instruccion
    And selecciono el "<Perfil2>" AC e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion
    And copio el numWio "<IO>"
    And ingreso a la instruccion "<IO>"
    And selecciono tipo de linea "<Data>"
    And selecciono Nro Linea "<Data>"
    And ingreso CostoFondoEspec "<Data>", Spread "<Data>" y Tasa "<Data>"
    And ingreso al modulo Caract Oper
    And selecciono Tipo Operacion "<Data>"
    And selecciono Tipo Cuenta "<Data>" Moneda Cuenta "<Data>" y escribo NroCuenta "<Data>"
    And escribo PrimerVctoOpe "<Data>" y PlazoTotalOpe "<Data>"
    And escribo Datos del Credito "<Data>" "<Data>" y selecciono "<Data>" "<Data>" "<Data>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
  #  And limpiar casillas
  #  And busco el Wio "<IO>"
  #  And ingresar a la informacion de la instruccion
  #  And ingreso al modulo Seguimiento
  #  And ingreso a Localizar Instruccion
  #  Then validar estacion Aprobacion_de_Instruccion
  #  And cerrar popup Localizar Incidente
  #  And click en cerrar sesion

    Examples:
      | Data | Perfil2             | IO                 |
      | 5    | Asistente Comercial | 000000002000214098 |

  @EscenarioN1_EjecutivoDeNegocio
  Scenario Outline: Estacion Aprobación Instruccion
    Given Inicializando la pagina de wio
    When ingresar el usuario Aprobacion Instruccion
    And selecciono el "<Perfil3>" EN e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion
    And copio el numWio "<IO>"
    And ingreso a la instruccion "<IO>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
  #  And limpiar casillas
  #  And busco el Wio "<IO>"
  #  And ingresar a la informacion de la instruccion
  #  And ingreso al modulo Seguimiento
  #  And ingreso a Localizar Instruccion
  #  Then validar estacion Verif_Docs_y_Cond_NI
  #  And cerrar popup Localizar Incidente
  #  And click en cerrar sesion

    Examples:
      | Data | Perfil3              | IO                 |
      | 1    | Ejecutivo de Negocio | 000000002000214094 |
      | 2    | Ejecutivo de Negocio | 000000002000214099 |
      | 3    | Ejecutivo de Negocio | 000000002000214095 |
      | 4    | Ejecutivo de Negocio | 000000002000214102 |
      | 5    | Ejecutivo de Negocio | 000000002000214098 |
      | 6    | Ejecutivo de Negocio | 000000002000214100 |
      | 7    | Ejecutivo de Negocio | 000000002000214103 |
      | 8    | Ejecutivo de Negocio | 000000002000214104 |
      | 9    | Ejecutivo de Negocio | 000000002000214114 |
      | 10   | Ejecutivo de Negocio | 000000002000214106 |
      | 11   | Ejecutivo de Negocio | 000000002000214107 |
      | 12   | Ejecutivo de Negocio | 000000002000214108 |
      | 13   | Ejecutivo de Negocio | 000000002000214109 |
      | 14   | Ejecutivo de Negocio | 000000002000214110 |
      | 15   | Ejecutivo de Negocio | 000000002000214115 |

  @EscenarioN1_AsistenteDeCC_N1
  Scenario Outline: Estacion Verificación De Documentos N1
    Given Inicializando la pagina de wio
    When ingresar el usuario Verificacion_NI
    And selecciono el "<Perfil4>" ACC e Ingresar
    And selecciono MenuWio
    And ingreso a BandejaEntradaCC
    And selecciono filtro Nro Instruccion
    And copio el numWio "<IO>"
    And ingreso a la instruccion "<IO>"
    And ingreso al Modulo Verif. Documentos
    And doy check a ConformidadDeCC
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And limpiar casillas
    And busco el Wio "<IO>"
    And verifico el NroOperacion_Reactiva "<Data>"
  #  And ingreso al modulo Seguimiento
  #  And ingreso a Localizar Instruccion
  #  Then validar estacion Desembolso_Emision
  #  And cerrar popup Localizar Incidente
  #  And click en cerrar sesion
    Examples:
      | Data | Perfil4                          | IO                 |
      | 1    | Asistente de Control de Creditos | 000000002000214094 |
