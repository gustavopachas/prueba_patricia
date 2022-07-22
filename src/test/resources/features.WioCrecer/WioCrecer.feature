Feature: Wio Pagare Normal-Crecer

  @InstruccionOperativaCrecer-Normal
  Scenario Outline: Solicitud de Pagare Normal-Crecer
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
    Then validar estacion Elaboracion_de_Instruccion
    And copio el Usuario de ElabInstruccion
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
    #ASISTENTE_COMERCIAL
    Given Inicializando la pagina de wio
    When ingresar el usuario AC_Crecer
    And selecciono el "<Perfil2>" AC e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion y copio el numInstOperativa
    And ingreso a la instruccion
    And selecciono tipo de linea "<Data>"
    And selecciono Nro Linea "<Data>"
    And ingreso CostoFondoEspec "<Data>", Spread "<Data>" y Tasa "<Data>"
    And ingreso al modulo Caract Oper
    And selecciono Tipo Operacion "<Data>"
    And selecciono Tipo Cuenta "<Data>" Moneda Cuenta "<Data>" y escribo NroCuenta "<Data>"
    And escribo PrimerVctoOpe "<Data>" y PlazoTotalOpe "<Data>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And buscar el wio por Nro de Instruccion
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    Then validar estacion Aprobacion_de_Instruccion
    And copio el Usuario de AprobInstruccion
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
    #EJECUTIVO_NEGOCIO
    Given Inicializando la pagina de wio
    When ingresar el usuario EN_Crecer
    And selecciono el "<Perfil3>" EN e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion y copio el numInstOperativa
    And ingreso a la instruccion
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And buscar el wio por Nro de Instruccion
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    Then validar estacion Verif_Docs_y_Cond_NI
    And copio el Usuario de VerifDocsyCondNI
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
    #AsistentedeControlCreditos
    Given Inicializando la pagina de wio
    When ingresar el usuario NI_Crecer
    And selecciono el "<Perfil4>" ACC e Ingresar
    And selecciono MenuWio
    And ingreso a BandejaEntradaCC
    And selecciono filtro Nro Instruccion y copio el numInstOperativa
    And ingreso a la instruccion
    And ingreso al Modulo Verif. Documentos
    And doy check a ConformidadDeCC
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And buscar el wio por Nro de Instruccion
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    Then validar estacion Desembolso_Emision
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
      #ASISTENTECPP
    Given Inicializando la pagina de wio
    When ingreso el usuario Asistente_AGyP
    And selecciono el "<Perfil_AGyP>" AGyP e Ingresar
    And selecciono MenuWio
    And ingreso a Bandeja de Entrada
    And selecciono filtro Nro Instruccion y copio el numInstOperativa
    And ingreso a la instruccion "<IO>"
    And dar check Desembolso_Emision
    And escribir el NroOperacion_Crecer "<Data>"
    And clic Grabar y Enviar
    And ingreso a Bandeja de Busqueda
    And buscar el wio por Nro de Instruccion
    And ingresar a la informacion de la instruccion
    And ingreso al modulo Seguimiento
    And ingreso a Localizar Instruccion
    Then validar el estado Cerrado
    And cerrar popup Localizar Incidente
    And click en cerrar sesion
    Examples:
      | Data | Usuario | Perfil        | Perfil2             | Perfil3              | Perfil4                          | Perfil5                           | Perfil6                     | Perfil_AGyP                      |
      | 1    | B10988  | Recepcionista | Asistente Comercial | Ejecutivo de Negocio | Asistente de Control de Creditos | Supervisor de Control de Creditos | Jefe de Control de Créditos | Asistente de Gestión de Procesos |

