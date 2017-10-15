package ec.facturacion.electronica.enumeraciones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum TipoEmisionEnum {
	/**
	 * Emisi�n normal
	 */
	@XmlEnumValue("1")
	NORMAL,

	/**
	 * Emisi�n por Indisponibilidad del Sistema
	 */
	@XmlEnumValue("2")
	INDISPONIBILIDAD;
}
