package ec.facturacion.electronica.enumeraciones;

public enum TipoComprobanteEnum {

	/**
	 * Factura
	 */
	FACTURA("01"),

	/**
	 * Nota de Cr�dito
	 */
	NOTA_DE_CREDITO("02"),

	/**
	 * Nota de Cr�dito
	 */
	NOTA_DE_DEBITO("05"),

	/**
	 * Nota de Cr�dito
	 */
	GUIA_DE_REMISION("06"),
	/**
	 * Nota de Cr�dito
	 */
	COMPROBANTE_DE_RETENCION("07");

	private String codigo;

	private TipoComprobanteEnum(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
}
