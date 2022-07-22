package com.everis.base.stepDefinitions;

import com.everis.base.steps.WioSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WioSD {
    @Steps
    WioSteps wioSteps;

    @Given("Inicializando la pagina de wio")
    public void Inicializandolapaginadewio() {
        wioSteps.openWio();
    }


    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String Usuario) {
        wioSteps.ingresoElUsuario(Usuario);
    }

    @And("selecciono el {string} e Ingresar")
    public void seleccionoElEIngresar(String Perfil) {
        wioSteps.seleccionoElEIngresar(Perfil);
    }


    @And("selecciono el {string} AC e Ingresar")
    public void seleccionoElACEIngresar(String Perfil2) {
        wioSteps.seleccionoElIngresarAC(Perfil2);
    }

    @And("selecciono el {string} EN e Ingresar")
    public void seleccionoElENEIngresar(String Perfil3) {
        wioSteps.seleccionoElENEIngresar(Perfil3);
    }

    @And("selecciono el {string} ACC e Ingresar")
    public void seleccionoElACCEIngresar(String Perfil4) {
        wioSteps.seleccionoElACCEIngresar(Perfil4);
    }

    @And("selecciono el {string} SCC e Ingresar")
    public void seleccionoElSCCEIngresar(String Perfil5) {
        wioSteps.seleccionoElSCCEIngresar(Perfil5);
    }


    @And("selecciono el {string} JCC e Ingresar")
    public void seleccionoElJCCEIngresar(String Perfil6) {
        wioSteps.seleccionoElJCCEIngresar(Perfil6);
    }

    @And("selecciono el {string} AGyP e Ingresar")
    public void seleccionoElAGyPEIngresar(String Perfil_AGyP) {
        wioSteps.seleccionoElAGyPEIngresar(Perfil_AGyP);
    }

    @When("ingresar el usuario AC_Crecer")
    public void UsuarioAC_Crecer() {
        wioSteps.UsuarioAC_Crecer();
    }

    @When("ingresar el usuario EN_Crecer")
    public void UsuarioEN_Crecer() {
        wioSteps.UsuarioEN_Crecer();
    }

    @When("ingresar el usuario NI_Crecer")
    public void UsuarioNI_CrecerI() {
        wioSteps.UsuarioNI_Crecer();
    }

    @When("ingresar el usuario NII_Crecer")
    public void ingresarElUsuarioNII_Crecer() {
        wioSteps.UsuarioNII_Crecer();
    }

    @When("ingresar el usuario NIII_Crecer")
    public void ingresarElUsuarioNIII_Crecer() {
        wioSteps.UsuarioNIII_Crecer();
    }

    @When("ingreso el usuario Asistente_AGyP")
    public void UsuarioAsistente_AGyP() {
        wioSteps.UsuarioAsistente_AGyP();
    }

    @And("selecciono MenuWio")
    public void seleccionoMenuWio() {
        wioSteps.selectWio();
    }

    @And("ingreso a NuevaInstruccionOperativa")
    public void ingresoNuevaInstruccionOperativa() {
        wioSteps.ingresoaNuevaInstruccionOperativa();
    }

    @And("ingreso CU{string}")
    public void ingresoCU(String txtCUCliente) {
        wioSteps.ingresoCUCliente(txtCUCliente);
    }


    @And("clic Continuar popup")
    public void ClicContinuarPopup() {
        wioSteps.ClicContinuarPopup();
    }

    @And("selecciono producto {string} Forma de OperacionA {string} OperacionB {string}")
    public void seleccionoProductoFormaDeOperacionAOperacionB(String Producto, String FormadeOperacionA, String FormadeOperacionB) {
        wioSteps.seleccionoProductoFormaDeOperacionAOperacionB(Producto, FormadeOperacionA, FormadeOperacionB);
    }

    @And("selecciono tipo de moneda {string} y escribo el importe {string}")
    public void seleccionoTipoDeMonedaYEscriboElImporte(String Importe, String Moneda) {
        wioSteps.seleccionoTipoDeMonedaYEscriboElImporte(Importe, Moneda);
    }


    @And("ingreso modulo Doc.Adjuntos")
    public void ingresomoduloDocAdjuntos() {
        wioSteps.DocAdjuntos();
    }

    @And("guardo el numero de la instruccion del {string}")
    public void guardoElNumeroDeLaInstruccion(String Test1) throws Throwable {
        wioSteps.guardoElNumeroDeLaInstruccion(Test1);
    }

    @And("clic Grabar y Enviar")
    public void ClicGrabarYEnviar() {
        wioSteps.ClicGrabarYEnviar();
    }

    @And("ingreso a Bandeja de Busqueda")
    public void ingresoABandejaDeBusqueda() {
        wioSteps.ingresoABandejaDeBusqueda();

    }

    @And("buscar el wio por Nro de Instruccion")
    public void buscarElWioPorNroDeInstruccion() {
        wioSteps.buscarElWioPorNroDeInstruccion();
    }

    @And("limpiar casillas")
    public void limpiarCasillas() {
        wioSteps.limpiarCasillas();
    }

    @And("busco el Wio {string}")
    public void buscoElWio(String IO) {
        wioSteps.buscoElWio(IO);
    }


    @And("ingresar a la informacion de la instruccion")
    public void ingresarALaInformacionDeLaInstruccion() {
        wioSteps.ingresarALaInformacionDeLaInstruccion();
    }

    @And("ingreso al modulo Seguimiento")
    public void ingresoAlModuloSeguimiento() {
        wioSteps.ingresoAlModuloSeguimiento();
    }

    @And("ingreso a Localizar Instruccion")
    public void ingresoALocalizarInstruccion() {
        wioSteps.ingresoALocalizarInstruccion();
    }


    @And("copio el Usuario de ElabInstruccion")
    public void copioElUsuarioDeElabInstruccion() {
        wioSteps.copioElUsuarioDeElabInstruccion();
    }

    @And("cerrar popup Localizar Incidente")
    public void cerrarPopupLocalizarIncidente() {
        wioSteps.cerrarPopupLocalizarIncidente();
    }

    @And("click en cerrar sesion")
    public void clickencerrarsesionR() {
        wioSteps.CerrarSesion();
    }

    @When("ingresar el usuario Elaboracion Instruccion")
    public void ingresarElUsuarioElaboracionInstruccion() {
        wioSteps.ingresarElUsuarioElaboracionInstruccion();
    }

    @And("ingreso a Bandeja de Entrada")
    public void ingresoABandejaDeEntrada() {
        wioSteps.ingresoABandejaDeEntrada();
    }

    @And("selecciono filtro Nro Instruccion")
    public void seleccionoFiltroNroInstruccion() {
        wioSteps.seleccionoFiltroNroInstruccion();
    }

    @And("copio el numWio {string}")
    public void copioElNumWio(String IO) {
        wioSteps.copioElNumWio(IO);
    }

    @And("selecciono filtro Nro Instruccion y copio el numInstOperativa")
    public void seleccionoFiltroNroInstruccionYCopioElNumInstOperativa() {
        wioSteps.seleccionoFiltroNroInstruccionYCopioElNumInstOperativa();
    }

    @And("ingreso a la instruccion")
    public void ingresoALaInstruccion() {
        wioSteps.ingresoALaInstruccion();
    }

    @And("ingreso a la instruccion {string}")
    public void ingresoALaInstruccion(String IO) {
        wioSteps.ingresoALaInstruccion(IO);
    }

    @And("selecciono tipo de linea {string}")
    public void seleccionoTipoDeLinea(String TipoLineaOperacion) {
        wioSteps.seleccionoTipoDeLinea(TipoLineaOperacion);
    }

    @And("selecciono Nro Linea {string}")
    public void seleccionoNroLinea(String NroLinea) {
        wioSteps.seleccionoNroLinea(NroLinea);
    }

    @And("ingreso CostoFondoEspec {string}, Spread {string} y Tasa {string}")
    public void ingresoCostoFondoEspecSpreadYTasa(String CostoFondoEspec, String Spread, String Tasa) {
        wioSteps.ingresoCostoFondoEspecSpreadYTasa(CostoFondoEspec, Spread, Tasa);
    }

    @And("ingreso al modulo Caract Oper")
    public void ingresoAlModuloCaractOper() {
        wioSteps.ingresoAlModuloCaractOper();
    }

    @And("selecciono Tipo Operacion {string}")
    public void seleccionoTipoOperacion(String TipoOperacion) {
        wioSteps.seleccionoTipoOperacion(TipoOperacion);
    }

    @And("selecciono Tipo Cuenta {string} Moneda Cuenta {string} y escribo NroCuenta {string}")
    public void seleccionoTipoCuentaMonedaCuentaYEscriboNroCuenta(String TipoCuenta, String MonedaCuenta, String NroCuenta) {
        wioSteps.seleccionoTipoCuentaMonedaCuentaYEscriboNroCuenta(TipoCuenta, MonedaCuenta, NroCuenta);
    }


    @And("escribo PrimerVctoOpe {string} y PlazoTotalOpe {string}")
    public void escriboPrimerVctoYPlazoTotalOpe(String PrimerVctoOpe, String PlazoTotalOpe) {
        wioSteps.escriboPrimerVctoOpeYPlazoTotalOpe(PrimerVctoOpe, PlazoTotalOpe);
    }

    @And("escribo Datos del Credito {string} {string} y selecciono {string} {string} {string}")
    public void escriboDatosDelCreditoYSelecciono(String NroCuotas, String CuotasDeGracia, String TipoDeGracia, String TipoDeCronograma, String Frecuencia) {
        wioSteps.escriboDatosDelCreditoYSelecciono(NroCuotas, CuotasDeGracia, TipoDeGracia, TipoDeCronograma, Frecuencia);
    }

    @And("copio el Usuario de AprobInstruccion")
    public void copioElUsuarioDeAprobInstruccion() {
        wioSteps.copioElUsuarioDeAprobInstruccion();
    }

    @When("ingresar el usuario Aprobacion Instruccion")
    public void ingresarElUsuarioAprobacionInstruccion() {
        wioSteps.ingresarElUsuarioAprobacionInstruccion();
    }

    @And("copio el Usuario de VerifDocsyCondNI")
    public void copioElUsuarioVerifDocsyCondNI() {
        wioSteps.copioElUsuarioVerifDocsyCondNI();
    }

    @When("ingresar el usuario Verificacion_NI")
    public void ingresarElUsuarioVerificacion_NI() {
        wioSteps.ingresarElUsuarioVerificacion_NI();
    }

    @And("ingreso a BandejaEntradaCC")
    public void ingresoABandejaEntradaCC() {
        wioSteps.ingresoABandejaEntradaCC();
    }

    @And("ingreso al Modulo Verif. Documentos")
    public void ingresoalModuloVerifDocumentos() {
        wioSteps.ModuloVeriDocumentos();
    }

    @And("doy check a ConformidadDeCC")
    public void doyCheckAConformidadDeCC() {
        wioSteps.doyCheckAConformidadDeCC();
    }

    @And("copio el Usuario de VerifDocsyCondNII")
    public void copioElUsuarioVerifDocsyCondNII() {
        wioSteps.copioElUsuarioVerifDocsyCondNII();
    }

    @When("ingresar el usuario Verificacion_NII")
    public void ingresarElUsuarioVerificacion_NII() {
        wioSteps.ingresarElUsuarioVerificacion_NII();
    }

    @And("copio el Usuario VerifDocsyCondNIII")
    public void copioElUsuarioVerifDocsyCondNIII() {
        wioSteps.copioElUsuarioVerifDocsyCondNIII();
    }

    @When("ingresar el usuario Verificacion_NIII")
    public void ingresarElUsuarioVerificacion_NIII() {
        wioSteps.ingresarElUsuarioVerificacion_NIII();
    }


    @And("verifico el NroOperacion_Reactiva {string}")
    public void NroOperacion_Reactiva(String Test1) throws Throwable {   //Test1-->NroCredito_Reactiva
        wioSteps.NroOperacion_Reactiva(Test1);
    }

    @And("dar check Desembolso_Emision")
    public void darCheckDesembolso_Emision() {
        wioSteps.darCheckDesembolso_Emision();
    }

    @And("escribir el NroOperacion_Crecer {string}")
    public void escribirElNroOperacion_Crecer(String NroOperacionCrecer) {
        wioSteps.escribirElNroOperacion_Crecer(NroOperacionCrecer);
    }

    @Then("validar el estado Cerrado")
    public void validarElEstadoCerrado() {
        wioSteps.validarElEstadoCerrado();
    }

    @Then("validar estacion Elaboracion_de_Instruccion")
    public void Elaboracion_de_Instruccion() {
        wioSteps.Elaboracion_de_Instruccion();
    }

    @Then("validar estacion Aprobacion_de_Instruccion")
    public void Aprobacion_de_Instruccion() {
        wioSteps.Aprobacion_de_Instruccion();
    }

    @Then("validar estacion Verif_Docs_y_Cond_NI")
    public void Verif_Docs_y_Cond_NI() {
        wioSteps.Verif_Docs_y_Cond_NI();
    }

    @Then("validar estacion Verif_Docs_y_Cond_NII")
    public void Verif_Docs_y_Cond_NII() {
        wioSteps.Verif_Docs_y_Cond_NII();
    }

    @Then("validar estacion Verif_Docs_y_Cond_NIII")
    public void Verif_Docs_y_Cond_NIII() {
        wioSteps.Verif_Docs_y_Cond_NIII();
    }

    @Then("validar estacion Desembolso_Emision")
    public void Desembolso_Emision() {
        wioSteps.Desembolso_Emision();
    }
}