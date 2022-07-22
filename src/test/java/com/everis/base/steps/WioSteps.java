package com.everis.base.steps;

import com.everis.base.pageObject.WioPage;
import com.everis.base.util.DomWebServices;
import com.everis.base.util.Util;
import com.everis.base.util.WebDriverUtils;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class WioSteps {
    private static final Logger
            logger = LoggerFactory.getLogger(WioSteps.class);
    public WioPage wioPage;
    public String parentWinHandle;
    public static String numInstOperativa = "";
    //USUARIOS_REACTIVA
    public static String UsuarioReactiva_ElabInstruccion = "b11101";
    public static String UsuarioReactiva_AprobInstruccion = "b8968";
    public static String UsuarioReactiva_NI = "B28092";
    public static String UsuarioReactiva_NII = "S27967";
    public static String UsuarioReactiva_NIII = "B21678";
    public static String NroCredito_Reactiva = "";
    //USUARIOS_CRECER
    public static String UserCrecer_ElabInstruccion = "b11101";
    public static String UserCrecer_AprobInstruccion = "b8968";
    public static String UserCrecer_NI = "B28092";
    public static String UserCrecer_NII = "B10708";
    public static String UserCrecer_NIII = "XT3972";
    public static String UserCrecer_Desembolso_Emision = "B14495";


    public DomWebServices domWebServices() {
        return new DomWebServices();
    }

    public void pause(Integer second) {
        try {
            SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void MetodoSwitchHandle() {
        String handle = WebDriverUtils.getHandle(wioPage.getDriver(), parentWinHandle);
        getDriver().switchTo().window(handle);
    }

    public void MetodoSwitchContent() {
        getDriver().switchTo().defaultContent();
    }

    @Step
    public void openWio() {
        wioPage.open();
        logger.info("Inicializando la pagina de wio");
    }

    public void ingresoElUsuario(String Usuario) {
        wioPage.txtUsuario.click();
        wioPage.txtUsuario.sendKeys(Usuario);
        logger.info("Ingreso el usuario :" + Usuario);
    }

    public void seleccionoElEIngresar(String Perfil) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil);
        wioPage.btnIngresar.click();
        pause(10);
        logger.info("Ingreso el perfil " + Perfil);
    }

    public void seleccionoElIngresarAC(String Perfil2) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil2);
        wioPage.btnIngresar.click();
        pause(10);
        logger.info("Selecciono el perfil AC " + Perfil2);
    }

    public void seleccionoElENEIngresar(String Perfil3) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil3);
        pause(10);
        wioPage.btnIngresar.click();
        logger.info("Selecciono perfil a EN " + Perfil3);
    }

    public void seleccionoElACCEIngresar(String Perfil4) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil4);
        wioPage.btnIngresar.click();
        pause(10);
        logger.info("Selecciono perfil Asistente CC " + Perfil4);
    }

    public void seleccionoElSCCEIngresar(String Perfil5) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil5);
        wioPage.btnIngresar.click();
        pause(10);
        logger.info("Selecciono perfil Supervisor CC " + Perfil5);
    }

    public void seleccionoElJCCEIngresar(String Perfil6) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil6);
        pause(10);
        wioPage.btnIngresar.click();
        logger.info("Selecciono perfil Jefe CC " + Perfil6);
    }

    public void seleccionoElAGyPEIngresar(String Perfil_AGyP) {
        wioPage.cbxPerfil.selectByVisibleText(Perfil_AGyP);
        wioPage.btnIngresar.click();
        logger.info("Selecciono perfil AGyP" + Perfil_AGyP);
    }

    public void selectWio() {
        pause(15);
        MetodoSwitchHandle();
        Actions builder = new Actions(wioPage.getDriver());
        builder.moveToElement(wioPage.btnMenuWio.getElement()).perform();
        wioPage.btnIntruccionOperativa.click();
        pause(15);
        logger.info("presiono select wio");
    }

    public void ingresoaNuevaInstruccionOperativa() {
        pause(15);
        MetodoSwitchHandle();
        Actions builder = new Actions(wioPage.getDriver());
        builder.moveToElement(wioPage.nMenuWio).perform();
        wioPage.nInstrucOperativa.click();
        pause(15);
        logger.info("ingreso a NuevaIntruccionOperativa");
    }

    public void ingresoCUCliente(String CUCliente) {
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtCUCliente.sendKeys(Util.ReadCellData(CUCliente, 1), Keys.ENTER);
        pause(15);
    }

    public void ClicContinuarPopup() {
        pause(10);
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrModal");
        wioPage.btnContinuar.click();
        pause(8);
        logger.info("Clic En Continuar Lista Popup");
    }

    public void seleccionoProductoFormaDeOperacionAOperacionB(String Producto, String FormadeOperacionA, String FormadeOperacionB) {
        pause(10);
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.cbxProducto.selectByVisibleText(Util.ReadCellData(Producto, 2));
        pause(5);
        wioPage.cbxFormadeOperacionA.selectByVisibleText(Util.ReadCellData(FormadeOperacionA, 3));
        pause(5);
        wioPage.cbxFormadeOperacionB.selectByVisibleText(Util.ReadCellData(FormadeOperacionB, 4));
        logger.info("Producto " + Producto + "FormadeOperacionA " + FormadeOperacionA + "FormaDeOperacionB " + FormadeOperacionB);
        pause(5);
    }

    public void seleccionoTipoDeMonedaYEscriboElImporte(String Moneda, String Importe) {
        pause(6);
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.cbxMoneda.selectByVisibleText(Util.ReadCellData(Moneda, 5));
        pause(5);
        wioPage.txtImporte.sendKeys(Util.ReadCellData(Importe, 6));
        logger.info("selecciono Tipo DeMoneda " + " EscribirElImporte " + Importe);
    }

    public void DocAdjuntos() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnDoc.click();
        wioPage.ckbConformeDoc1.click();
        wioPage.ckbConformeDoc2.click();
        wioPage.ckbConformeDoc3.click();
        wioPage.ckbConformeDoc4.click();
        wioPage.ckbConformeDoc5.click();
        wioPage.ckbFyP1.click();
        wioPage.ckbFyP2.click();
        wioPage.ckbFyP3.click();
        wioPage.ckbFyP4.click();
        wioPage.ckbFyP5.click();
        logger.info("Documento adjunto");
    }

    public void guardoElNumeroDeLaInstruccion(String Test1) throws Throwable {
        logger.info("guardo El Numero De La Instruccion");
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        numInstOperativa = wioPage.txtNroInstruccion.getValue();
        logger.info("inscreada " + numInstOperativa);
        domWebServices().guardarResultadosTablaDatos(Test1, "Data_Wio", "Respuestas", "numInstOperativa", numInstOperativa);
    }

    public void ClicGrabarYEnviar() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnGrabaryEnviar.click();
        Alert alert = wioPage.getDriver().switchTo().alert();
        alert.accept();
        pause(20);
        logger.info("doy Clic A GrabarYEnviar La IO");
    }

    public void ingresoABandejaDeBusqueda() {
        MetodoSwitchContent();
        getDriver().switchTo().frame(wioPage.ifrMenuLateral.getElement());
        pause(10);
        wioPage.btnBandejadeBusqueda.click();
        pause(10);
        logger.info("ingreso a la Bandeja de Busqueda");
    }

    public void buscarElWioPorNroDeInstruccion() {
        MetodoSwitchHandle();
        pause(20);
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtBGNroIntruccion.sendKeys(numInstOperativa, Keys.ENTER);
        pause(10);
        logger.info("buscar el Wio por Nro de Instruccion");
    }

    public void ingresarALaInformacionDeLaInstruccion() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnInformaciondelWio.click();
        pause(5);
        logger.info("ingresar a la informacion");
    }

    public void limpiarCasillas() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnLimpiar.click();
        logger.info("buscar la instruccion por Nro de Instruccion");
    }

    public void buscoElWio(String IO) {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtBGNroIntruccion.sendKeys(IO, Keys.ENTER);
        logger.info("busco el Wio " + IO);
    }

    public void ingresoAlModuloSeguimiento() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnSeguimiento.click();
        logger.info("ingreso AlModulo Seguimiento");
    }

    public void ingresoALocalizarInstruccion() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnLocalizarInst.click();
        logger.info("ingreso a Localizar Instruccion");
    }

    public void copioElUsuarioDeElabInstruccion() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        UsuarioReactiva_ElabInstruccion = wioPage.txtUsuarioNext.getText();
        logger.info("copio y guardo el Usuario de ElabInstruccion " + UsuarioReactiva_ElabInstruccion);
    }

    public void cerrarPopupLocalizarIncidente() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrModal");
        wioPage.btnCerrarLocIncidente.click();
        logger.info("cerrar popup Localizar Incidente");
    }

    public void CerrarSesion() {
        MetodoSwitchHandle();
        wioPage.btnCerrarSesion.click();
        getDriver().quit();
        logger.info("cerrar sesion");
    }

    public void UsuarioAC_Crecer() {
        logger.info("ingresar el usuario Elaboracion Instruccion " + UserCrecer_ElabInstruccion);
        wioPage.txtUsuario.sendKeys(UserCrecer_ElabInstruccion);
    }

    public void ingresarElUsuarioElaboracionInstruccion() {
        logger.info("ingresar el usuario Elaboracion Instruccion " + UsuarioReactiva_ElabInstruccion);
        wioPage.txtUsuario.sendKeys(UsuarioReactiva_ElabInstruccion);
    }


    public void UsuarioEN_Crecer() {
        wioPage.txtUsuario.sendKeys(UserCrecer_AprobInstruccion);
        logger.info("ingresar el usuario Aprobacion Instruccion " + UserCrecer_AprobInstruccion);
    }

    public void UsuarioNI_Crecer() {
        logger.info("ingresar el usuario Verificacion_NI " + UserCrecer_NI);
        wioPage.txtUsuario.sendKeys(UserCrecer_NI);
    }

    public void UsuarioNII_Crecer() {
        wioPage.txtUsuario.sendKeys(UserCrecer_NII);
        logger.info("ingresar el usuario Verificacion_NII " + UserCrecer_NII);
    }

    public void UsuarioNIII_Crecer() {
        wioPage.txtUsuario.sendKeys(UserCrecer_NIII);
        logger.info("ingresar el usuario Verificacion_NIII " + UserCrecer_NIII);
    }

    public void UsuarioAsistente_AGyP() {
        wioPage.txtUsuario.sendKeys(UserCrecer_Desembolso_Emision);
        logger.info("ingresar el usuario AGyP " + UserCrecer_Desembolso_Emision);
    }

    public void ingresoABandejaDeEntrada() {
        pause(4);
        MetodoSwitchContent();
        getDriver().switchTo().frame(wioPage.ifrMenuLateral.getElement());
        wioPage.btnBandejadeEntrada.click();
        MetodoSwitchContent();
        logger.info("ingreso a Bandeja de Entrada");
    }

    public void seleccionoFiltroNroInstruccionYCopioElNumInstOperativa() {
        MetodoSwitchHandle();
        MetodoSwitchContent();
        getDriver().switchTo().frame("ifrDerecha");
        getDriver().switchTo().frame("ifrListado");
        wioPage.cbxFiltroNroInstruccion.click();
        wioPage.txtNroInstruccionCreada.sendKeys(numInstOperativa, Keys.ENTER);
    }

    public void seleccionoFiltroNroInstruccion() {
        MetodoSwitchHandle();
        MetodoSwitchContent();
        getDriver().switchTo().frame("ifrDerecha");
        getDriver().switchTo().frame("ifrListado");
        wioPage.cbxFiltroNroInstruccion.click();
    }

    public void copioElNumWio(String IO) {
        wioPage.txtNroInstruccionCreada.sendKeys(IO, Keys.ENTER);
        logger.info(IO);
        pause(5);
    }

    public void ingresoALaInstruccion() {
        MetodoSwitchHandle();
        MetodoSwitchContent();
        getDriver().switchTo().frame("ifrDerecha");
        getDriver().switchTo().frame("ifrListado");
        Actions builder = new Actions(wioPage.getDriver());
        builder.doubleClick(wioPage.grillaWIO).build().perform();
        pause(10);
        logger.info("ingreso nro de la int ope");
    }


    public void ingresoALaInstruccion(String IO) {
        MetodoSwitchHandle();
        MetodoSwitchContent();
        pause(15);
        getDriver().switchTo().frame("ifrDerecha");
        getDriver().switchTo().frame("ifrListado");
        if (wioPage.grillaWIO.getText().equals(IO)) {
            pause(15);
            Actions builder = new Actions(wioPage.getDriver());
            pause(5);
            builder.doubleClick(wioPage.grillaWIO).build().perform();
            pause(5);
            logger.info("inst_ope encontrada");
        } else {
            logger.info("IO no encontrada");
        }
    }

    public void seleccionoTipoDeLinea(String TipoLineaOperacion) {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.cbxTipoLineaOperacion.selectByVisibleText(Util.ReadCellData(TipoLineaOperacion, 7));
        pause(5);
        logger.info("selecciono El Tipo De Linea " + TipoLineaOperacion);
    }

    public void seleccionoNroLinea(String NroLinea) {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        pause(9);
        if (wioPage.txtNroLinea.isVisible()) {
            pause(4);
            logger.info("Selecciono linea visible");
        } else {
            wioPage.cbxNroLinea.selectByVisibleText(Util.ReadCellData(NroLinea, 8));
            if (NroLinea.equals(Util.ReadCellData(NroLinea, 8))) {
                wioPage.cbxNroLinea.isVisible();
                pause(8);
                logger.info("encontro y selecciono la linea");
            }
            logger.info("selecciono El NroLinea " + NroLinea);
        }
    }

    public void ingresoCostoFondoEspecSpreadYTasa(String CostoFondoEspec, String Spread, String Tasa) {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtCostoFondoEsp.clear();
        wioPage.txtCostoFondoEsp.sendKeys(Util.ReadCellData(CostoFondoEspec, 9));
        wioPage.txtTasa.clear();
        wioPage.txtTasa.sendKeys(Util.ReadCellData(Tasa, 10));
        pause(3);
        wioPage.txtSpread.clear();
        wioPage.txtSpread.sendKeys(Util.ReadCellData(Spread, 11));
        logger.info("ingreso Los Datos CostoFondoEspec Spread Y Tasa");
    }

    public void ingresoAlModuloCaractOper() {
        pause(5);
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnCaractOper.click();
        pause(10);
        logger.info("ingreso Al Modulo CaractOper");
    }

    public void seleccionoTipoOperacion(String TipoOperacion) {
        pause(8);
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.cbxTipoOperacion.selectByVisibleText(Util.ReadCellData(TipoOperacion, 12));
        logger.info("selecciono Tipo Operacion " + TipoOperacion);
    }

    public void seleccionoTipoCuentaMonedaCuentaYEscriboNroCuenta(String TipoCuenta, String MonedaCuenta, String NroCuenta) {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.cbxTipoCuenta.selectByVisibleText(Util.ReadCellData(TipoCuenta, 13));
        pause(5);
        wioPage.cbxMonedaCuenta.selectByVisibleText(Util.ReadCellData(MonedaCuenta, 14));
        pause(5);
        wioPage.txtNroCuenta.sendKeys(Util.ReadCellData(NroCuenta, 15));
        pause(5);
        logger.info(" selecciono el TipoCuenta " + TipoCuenta + " MonedaCta " + MonedaCuenta + "y escribo NroCta " + NroCuenta);
    }

    public void escriboPrimerVctoOpeYPlazoTotalOpe(String PrimerVctoOpe, String PlazoTotalOpe) {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtPrimerVctoOperacion.sendKeys(Util.ReadCellData(PrimerVctoOpe, 16));
        wioPage.txtPlazoTotalOperacion.sendKeys(Util.ReadCellData(PlazoTotalOpe, 17));
        logger.info("escribo PrimerVctoOpe y PlazoTotalOpe");
    }

    public void escriboDatosDelCreditoYSelecciono(String NroCuotas, String CuotasDeGracia, String TipoDeGracia, String TipoDeCronograma, String Frecuencia) {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtNroCuotas.getElement().clear();
        pause(5);
        wioPage.txtNroCuotas.getElement().sendKeys(Util.ReadCellData(NroCuotas, 18));
        wioPage.txtCuotasGracia.clear();
        wioPage.txtCuotasGracia.sendKeys(Util.ReadCellData(CuotasDeGracia, 19));
        wioPage.cbxTipoDeGracia.selectByVisibleText(Util.ReadCellData(TipoDeGracia, 20));
        wioPage.cbxTipoDeCronograma.selectByVisibleText(Util.ReadCellData(TipoDeCronograma, 21));
        wioPage.cbxFrecuencia.selectByVisibleText(Util.ReadCellData(Frecuencia, 22));
        logger.info("escribo NroCuotas " + NroCuotas + ", CuotasDeGracia " + CuotasDeGracia + " y selecciono TipoDeGracia " + TipoDeGracia + ", TipoDeCronograma " + TipoDeCronograma + ", Frecuencia " + Frecuencia);
    }

    public void copioElUsuarioDeAprobInstruccion() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        UsuarioReactiva_AprobInstruccion = wioPage.txtUsuarioNext.getText();
        logger.info("copio y guardo el Usuario de AprobInstruccion " + UsuarioReactiva_AprobInstruccion);
    }

    public void ingresarElUsuarioAprobacionInstruccion() {
        wioPage.txtUsuario.sendKeys(UsuarioReactiva_AprobInstruccion);
        logger.info("ingresar el usuario Aprobacion Instruccion " + UsuarioReactiva_AprobInstruccion);
    }

    public void copioElUsuarioVerifDocsyCondNI() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        UsuarioReactiva_NI = wioPage.txtUsuarioNext.getText();
        UsuarioReactiva_NI = wioPage.txtUsuarioNext.getText();
        logger.info("copio y guardo el Usuario VerifDocsyCondNI " + UsuarioReactiva_NI);
    }

    public void ingresarElUsuarioVerificacion_NI() {
        logger.info("ingresar el usuario Verificacion_NI " + UsuarioReactiva_NI);
        wioPage.txtUsuario.sendKeys(UsuarioReactiva_NI);
    }

    public void ingresoABandejaEntradaCC() {
        MetodoSwitchContent();
        getDriver().switchTo().frame(wioPage.ifrMenuLateral.getElement());
        wioPage.btnBandejaEntradaCC.click();
        MetodoSwitchContent();
        logger.info("ingreso a BandejaEntradaCC");
    }

    public void ModuloVeriDocumentos() {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        wioPage.btnVerifDeDocumentosYCond.click();
        logger.info("ingreso A La Pestaña VerifDeDocumentosYCond");

    }

    public void doyCheckAConformidadDeCC() {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.chbConformidadDeControlCreditos.click();
        logger.info("doy check a ConformidadDeCC");
    }


    public void copioElUsuarioVerifDocsyCondNII() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        UsuarioReactiva_NII = wioPage.txtUsuarioNext.getText();
        logger.info("copio y guardo el Usuario VerifDocsyCondNII " + UsuarioReactiva_NII);
    }

    public void ingresarElUsuarioVerificacion_NII() {
        wioPage.txtUsuario.sendKeys(UsuarioReactiva_NII);
        logger.info("ingresar el usuario Verificacion_NII " + UsuarioReactiva_NII);
    }

    public void copioElUsuarioVerifDocsyCondNIII() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        UsuarioReactiva_NIII = wioPage.txtUsuarioNext.getText();
    }

    public void ingresarElUsuarioVerificacion_NIII() {
        wioPage.txtUsuario.sendKeys(UsuarioReactiva_NIII);
        logger.info("ingresar el usuario Verificacion_NIII " + UsuarioReactiva_NIII);
    }

    public void NroOperacion_Reactiva(String Test1) throws Throwable {
        MetodoSwitchHandle();
        wioPage.getDriver().switchTo().frame("ifrDerecha");
        NroCredito_Reactiva = wioPage.btnNroOperacion.getText();
        wioPage.btnNroOperacion.click();
        logger.info("verifico El NroOperacion " + NroCredito_Reactiva);
        domWebServices().guardarResultadosTablaDatos(Test1, "Data_Wio", "Respuestas", "NroOperacionReactiva", NroCredito_Reactiva);
    }

    public void darCheckDesembolso_Emision() {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.chbDesembolsoEmisionDeLaOperacion.click();
        logger.info("dar check a Desembolso_Emision");
    }

    public void escribirElNroOperacion_Crecer(String NroOperacionCrecer) {
        MetodoSwitchHandle();
        getDriver().switchTo().frame("ifrDerecha");
        wioPage.txtNroDesembolso.sendKeys(Util.ReadCellData(NroOperacionCrecer, 23));
        logger.info(" selecciono el NroOperacion " + NroOperacionCrecer);
    }

    public void validarElEstadoCerrado() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.lblMensaje.getText().contains("Cerrada")) {
            logger.info("Estado: " + wioPage.lblMensaje.getText());
        } else
            logger.info("error de estado");
    }

    @Step
    public void Elaboracion_de_Instruccion() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.txtEstacionNext.getText().equals("Elaboracion_de_Instruccion")) {
            logger.info("Validar siguiente estacion :  " + wioPage.txtEstacionNext.getText());
        } else
            logger.info("error de Validacion");
    }

    public void Aprobacion_de_Instruccion() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.txtEstacionNext.getText().equals("Aprobacion_de_Instruccion")) {
            logger.info("Validar siguiente estacion :  " + wioPage.txtEstacionNext.getText());
        } else
            logger.info("error de Validacion");
    }

    public void Verif_Docs_y_Cond_NI() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.txtEstacionNext.getText().equals("Verif_Docs_y_Cond_N1")) {
            logger.info("Validar siguiente estacion :  " + wioPage.txtEstacionNext.getText());
        } else
            logger.info("error de Validacion");
    }

    public void Verif_Docs_y_Cond_NII() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.txtEstacionNext.getText().equals("Verif_Docs_y_Cond_N2")) {
            logger.info("Validar siguiente estacion :  " + wioPage.txtEstacionNext.getText());
        } else
            logger.info("error de Validacion");
    }

    public void Verif_Docs_y_Cond_NIII() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.txtEstacionNext.getText().equals("Verif_Docs_y_Cond_N3")) {
            logger.info("Validar siguiente estacion :  " + wioPage.txtEstacionNext.getText());
        } else
            logger.info("error de Validacion");
    }

    public void Desembolso_Emision() {
        MetodoSwitchContent();
        wioPage.getDriver().switchTo().frame("ifrModal");
        if (wioPage.txtEstacionNext.getText().equals("Desembolso_Emision")) {
            logger.info("Validar siguiente estacion :  " + wioPage.txtEstacionNext.getText());
        } else
            logger.info("error de Validacion");
    }
}



