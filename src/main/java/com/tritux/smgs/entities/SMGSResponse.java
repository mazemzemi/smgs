package com.tritux.smgs.entities;

/**
 * <h2>SMGS response.</h2>
 *
 * @author
 *         <h4>mazemzemi.</h4>
 * @since 25/11/2016.
 *
 */
public class SMGSResponse {

	/**
	 * Response code.
	 */
	private Integer code;

	/**
	 * Response status.
	 */
	private String status;

	/**
	 * Gets the value of the code property.
	 *
	 * @return possible object is {@link Integer }.
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Defines the value of the code property.
	 *
	 * @param code
	 *            allowed object is {@link Integer }.
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link String }.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Defines the value of the status property.
	 *
	 * @param status
	 *            allowed object is {@link String }.
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * Override toString method.
	 * 
	 * @return SMGSResponse to string value.
	 */
	@Override
	public String toString() {
		return "[SMGS RESPONSE] : SMGSResponse [code=" + code + " status=" + status + "]";
	}

}
