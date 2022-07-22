package com.everis.base.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.bbva.pe/")  //  http://S503VD09/wdc/index.aspx   //http://s503va11/wdc/index.aspx   -->oficial
public class WioPage extends PageObject {

    @FindBy(id = "txtUsuario")
    public WebElement txtUsuario;
    @FindBy(id = "ddlPerfil")
    public WebElementFacade cbxPerfil;
    @FindBy(id = "btnIngresar")
    public WebElement btnIngresar;
    @FindBy(xpath = "/html/body/form/table[2]/tbody/tr[1]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/a")
    public WebElementFacade btnMenuWio;  //Facade
   @FindBy(css = "a[href='/wdc/WIO/frmPrincipalpwio.aspx']")
  public WebElementFacade btnIntruccionOperativa;
   @FindBy(xpath = "/html/body/form/table[3]/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/table/tbody/tr/td[1]/a")
   public WebElement nMenuWio;
    @FindBy(xpath = "/html/body/form/table[3]/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr[1]/td/table/tbody/tr/td/a")
    public WebElement nInstrucOperativa;
    @FindBy(id = "txtCodCliente")
    public WebElement txtCUCliente;
    @FindBy(id = "btnConfirmar")
    public WebElement btnContinuar;
    @FindBy(id = "tbContenedor_tbpnInfoGeneral_ddlProdServ")
    public WebElementFacade cbxProducto;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlFormaOper\"]")
    public WebElementFacade cbxFormadeOperacionA;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlReactiva\"]")
    public WebElementFacade cbxFormadeOperacionB;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnInfoGeneral_ddlMoneda\"]")
    public WebElementFacade cbxMoneda;
    @FindBy(id = "tbContenedor_tbpnInfoGeneral_txtImporte")
    public WebElement txtImporte;
    @FindBy(id = "txtNroInstruccion")
    public WebElementFacade txtNroInstruccion;
    @FindBy(id = "__tab_tbContenedor_tbpnDocAdjuntos")
    public WebElement btnDoc;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl02_chkConformidad")
    public WebElement ckbConformeDoc1;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl03_chkConformidad")
    public WebElement ckbConformeDoc2;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl04_chkConformidad")
    public WebElement ckbConformeDoc3;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl05_chkConformidad")
    public WebElement ckbConformeDoc4;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl06_chkConformidad")
    public WebElement ckbConformeDoc5;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl02_chkFirmas")
    public WebElement ckbFyP1;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl03_chkFirmas")
    public WebElement ckbFyP2;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl04_chkFirmas")
    public WebElement ckbFyP3;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl05_chkFirmas")
    public WebElement ckbFyP4;
    @FindBy(id = "tbContenedor_tbpnDocAdjuntos_gvwObligatorios_ctl06_chkFirmas")
    public WebElement ckbFyP5;
    @FindBy(id = "btnEnviarProc")
    public WebElementFacade btnGrabaryEnviar;
    @FindBy(xpath = "//*[@id='tblMenu']/tbody/tr[1]/td[1]/iframe")
    public WebElementFacade ifrMenuLateral;
    @FindBy(linkText = "Bandeja de Búsqueda")
    public WebElement btnBandejadeBusqueda;
    @FindBy(id = "btnBorrar")
    public WebElement btnLimpiar;
    @FindBy(id = "txtNroInstruccion")
    public WebElement txtBGNroIntruccion;
    @FindBy(xpath = "//*[@id=\"gvwBusqueda\"]/tbody/tr[2]/td[2]")
    public WebElement btnInformaciondelWio;
    @FindBy(id = "__tab_tbContenedor_tbpnSeguimiento")
    public WebElement btnSeguimiento;
    @FindBy(id = "tbContenedor_tbpnSeguimiento_lkbLocalizarInc")
    public WebElement btnLocalizarInst;
    @FindBy(xpath = "//*[@id='gvwUsuariosInc']/tbody/tr[2]/td[1]")
    public WebElement txtUsuarioNext;
    @FindBy(xpath = "//*[@id='gvwUsuariosInc']/tbody/tr[2]/td[4]")
    public WebElement txtEstacionNext;
    @FindBy(id = "btnCerrar")
    public WebElement btnCerrarLocIncidente;
    @FindBy(id = "ctl00_lkbCerrarSession")
    public WebElement btnCerrarSesion;
    @FindBy(linkText = "Bandeja de Entrada")
    public WebElement btnBandejadeEntrada;
    @FindBy(xpath = "/html/body/form/table[1]/tbody/tr/td/table/tbody/tr/td[3]/div/select/option[2]")
    public WebElement cbxFiltroNroInstruccion;
    @FindBy(xpath = "//*[@id=\"txtBuscar\"]")
    public WebElement txtNroInstruccionCreada;
    @FindBy(id = "lnk0")   //   xpath   -->>   //[@id=\"0\"]/td[2]
    public WebElementFacade grillaWIO;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnLineas_ddlTipo\"]")
    public WebElementFacade cbxTipoLineaOperacion;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnLineas_ddlNroLinea\"]")   //ifrDerecha
    public WebElementFacade cbxNroLinea;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tbpnLineas_txtNroLinea\"]")
    public WebElementFacade txtNroLinea;
    @FindBy(id = "tbContenedor_tbpnLineas_txtCostoFondoEspecial")
    public WebElement txtCostoFondoEsp;
    @FindBy(id = "tbContenedor_tbpnLineas_gvwLineas_ctl02_txtValorProp")
    public WebElement txtTasa;
    @FindBy(id = "tbContenedor_tbpnLineas_gvwLineas_ctl03_txtValorProp")
    public WebElement txtSpread;
    @FindBy(id = "__tab_tbContenedor_tpCaractOper")
    public WebElement btnCaractOper;
    @FindBy(id = "__tab_tbContenedor_tbpnVerDocCond")
    public WebElement btnVerifDeDocumentosYCond;
    @FindBy(id = "tbContenedor_tbpnVerDocCond_cbConfControlCred")
    public WebElementFacade chbConformidadDeControlCreditos;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_ddlTipoOperCaractOper\"]")
    public WebElementFacade cbxTipoOperacion;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_ddlTipoCuenta\"]")
    public WebElementFacade cbxTipoCuenta;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_ddlMonedaCuentaCaractOper\"]")
    public WebElementFacade cbxMonedaCuenta;
    @FindBy(id = "tbContenedor_tpCaractOper_txtNroCuentaCaractOper")
    public WebElement txtNroCuenta;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_txtVOPrimerVcto\"]")
    public WebElement txtPrimerVctoOperacion;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_txtVOPlazoTotal\"]")
    public WebElement txtPlazoTotalOperacion;
    @FindBy(id = "tbContenedor_tpCaractOper_txtRP_NroCuotas")
    public WebElementFacade txtNroCuotas;
    @FindBy(id = "tbContenedor_tpCaractOper_txtRP_CuotasGracia")
    public WebElement txtCuotasGracia;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_ddlRP_TipoGracia\"]")
    public WebElementFacade cbxTipoDeGracia;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_ddlRP_TipoCrnograma\"]")
    public WebElementFacade cbxTipoDeCronograma;
    @FindBy(xpath = "//*[@id=\"tbContenedor_tpCaractOper_ddlRP_Frecuencia\"]")
    public WebElementFacade cbxFrecuencia;
    @FindBy(linkText = "Bandeja Entrada")
    public WebElement btnBandejaEntradaCC;
    @FindBy(xpath = "//*[@id=\"gvwBusqueda\"]/tbody/tr[2]/td[13]")
    public WebElement btnNroOperacion;
    @FindBy(id = "tbContenedor_tbpnDesembolso_cbDesembolso")
    public WebElementFacade chbDesembolsoEmisionDeLaOperacion;
    @FindBy(id = "tbContenedor_tbpnDesembolso_txtNroDesembolso")
    public WebElement txtNroDesembolso;
    @FindBy(id = "lblMensaje")
    public WebElement lblMensaje;
}