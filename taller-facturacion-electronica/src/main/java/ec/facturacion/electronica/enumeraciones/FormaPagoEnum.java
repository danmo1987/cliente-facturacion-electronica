package ec.facturacion.electronica.enumeraciones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum FormaPagoEnum {
	/**
	 * Sin utilizaci�n del sistema de financiero
	 */
	@XmlEnumValue("01")
	SIN_UTILIZACION_DEL_SISTEMA_FINANCIERO,

	/**
	 * Compensaci�n de deudas
	 * 
	 */
	@XmlEnumValue("15")
	COMPENSACION_DE_DEUDAS,
	/**
	 * Tarjeta de d�bito
	 */
	@XmlEnumValue("16")
	TARJETA_DE_DEBITO,
	/**
	 * Dinero electr�nico
	 */
	@XmlEnumValue("17")
	DINERO_ELECTRONICO,
	/**
	 * Impuesto a la Salida de Divisas
	 */
	@XmlEnumValue("18")
	TARJETA_PREPAGO,
	/**
	 * Tarjetas de cr�dito
	 */
	@XmlEnumValue("19")
	TARJETA_DE_CREDITO,
	/**
	 * Otros con utilizaci�n del sistema Financiero
	 */
	@XmlEnumValue("20")
	OTROS_CON_UTILIZACION_DEL_SISTEMA_FINANCIERO,
	/**
	 * Endoso de T�tulos
	 */
	@XmlEnumValue("21")
	ENDOSO_DE_TITULOS;
}
