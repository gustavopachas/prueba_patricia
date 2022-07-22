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
    And ingreso a Bandeja de Busqueda
    And buscar el wio por Nro de Instruccion
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    And copio el Usuario de ElabInstruccion
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
    Examples:
      | Data | Usuario | Perfil        |
      | 1    | B10988  | Recepcionista |
      | 2    | B10988  | Recepcionista |
      | 3    | B10988  | Recepcionista |

  @EscenarioN1_AsistenteComercial
  Scenario Outline: Estacion Elaboración Instruccion
    Given Inicializando la pagina de wio
    When ingresar el usuario AC_Crecer
    And selecciono el "<Perfil2>" AC e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion
    And copio el numWio "<IO>"
    And ingreso a la instruccion "<IO>"
    And selecciono Nro Linea "<Data>"
    And ingreso CostoFondoEspec "<Data>", Spread "<Data>" y Tasa "<Data>"
    And ingreso al modulo Caract Oper
    And selecciono Tipo Operacion "<Data>"
    And selecciono Tipo Cuenta "<Data>" Moneda Cuenta "<Data>" y escribo NroCuenta "<Data>"
    And escribo PrimerVctoOpe "<Data>" y PlazoTotalOpe "<Data>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And limpiar casillas
    And busco el Wio "<IO>"
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    And copio el Usuario de AprobInstruccion
    And cerrar popup Localizar Incidente
    And click en cerrar sesion

    Examples:
      | Data | Perfil2             | IO                 |
      | 1    | Asistente Comercial | 000000002000211363 |
      | 2    | Asistente Comercial | 000000002000211364 |

  @EscenarioN1_EjecutivoDeNegocio
  Scenario Outline: Estacion Aprobación Instruccion
    Given Inicializando la pagina de wio
    Given Inicializando la pagina de wio
    When ingresar el usuario EN_Crecer
    And selecciono el "<Perfil3>" EN e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion
    And copio el numWio "<IO>"
    And ingreso a la instruccion "<IO>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And limpiar casillas
    And busco el Wio "<IO>"
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    And copio el Usuario de VerifDocsyCondNI
    And cerrar popup Localizar Incidente

    Examples:
      | Data | Perfil3              | IO                 |
      | 1    | Ejecutivo de Negocio | 000000002000212174 |

  @EscenarioN1_AsistenteDeCC_N1
  Scenario Outline: Estacion Verificación De Documentos N1
    Given Inicializando la pagina de wio
    When ingresar el usuario NI_Crecer
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
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    Then validar estacion Desembolso_Emision
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
    Examples:
      | Data | Perfil4                          | IO                 |
      | 1    | Asistente de Control de Creditos | 000000002000212174 |


  @Asistente_GP_IO_N1
  Scenario Outline: Estacion Verificacion De Documentos N1
    Given Inicializando la pagina de wio
    When ingreso el usuario Asistente_AGyP
    And selecciono el "<Perfil_AGyP>" AGyP e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion
    And copio el numWio "<IO>"
    And ingreso a la instruccion "<IO>"
    And dar check Desembolso_Emision
    And escribir el NroOperacion_Crecer "<Data>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And limpiar casillas
    And busco el Wio "<IO>"
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    Then validar el estado Cerrado
    And cerrar popup Localizar Incidente
    And click en cerrar sesion

    Examples:
      | Data | Perfil_AGyP                      | IO         |
      | 1    | Asistente de Gestión de Procesos | 2000211855 |