package com.tritux.smgs.entities;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * <h2>SMGS error.</h2>
 *
 * @author
 *         <h4>mazemzemi.</h4>
 * @since 25/11/2016.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SMGSError {

	/**
	 * Error object.
	 */
	@JsonProperty("errors")
	private Errors errors;

	/**
	 * Gets the value of the error property.
	 *
	 * @return possible object is {@link Errors }.
	 */
	public final Errors getError() {
		return errors;
	}

	/**
	 * Defines the value of the errors property.
	 *
	 * @param errors
	 *            allowed object is {@link Errors }.
	 */
	public final void setError(Errors errors) {
		this.errors = errors;
	}

	/**
	 * Override toString method.
	 * 
	 * @return SMGSError to string value.
	 */
	@Override
	public String toString() {
		return "SMGSError [errors=" + errors.toString() + "]";
	}

}
