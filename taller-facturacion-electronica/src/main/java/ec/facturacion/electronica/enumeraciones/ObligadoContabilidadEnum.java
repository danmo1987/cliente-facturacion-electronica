package ec.facturacion.electronica.enumeraciones;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum ObligadoContabilidadEnum {
	/**
	 * Emisi�n normal
	 */
	@XmlEnumValue("SI")
	SI,

	/**
	 * Emisi�n por Indisponibilidad del Sistema
	 */
	@XmlEnumValue("NO")
	NO;
}
