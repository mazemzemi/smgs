package com.tritux.smgs.entities;

/**
 * <h2>Errors.</h2>
 *
 * @author
 *         <h4>mazemzemi.</h4>
 * @since 25/11/2016.
 *
 */
public class Errors {

	/**
	 * User name error message.
	 */
	private String username;

	/**
	 * Password error message.
	 */
	private String password;

	/**
	 * Origin error message.
	 */
	private String origin;

	/**
	 * Destination error message.
	 */
	private String destination;

	/**
	 * Text error message.
	 */
	private String text;

	/**
	 * Gets the value of the user name property.
	 *
	 * @return possible object is {@link String }.
	 */
	public final String getUsername() {
		return username;
	}

	/**
	 * Defines the value of the user name property.
	 *
	 * @param username
	 *            allowed object is {@link String }.
	 */
	public final void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Gets the value of the password property.
	 *
	 * @return possible object is {@link String }.
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * Defines the value of the password property.
	 *
	 * @param password
	 *            allowed object is {@link String }.
	 */
	public final void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Gets the value of the origin property.
	 *
	 * @return possible object is {@link String }.
	 */
	public final String getOrigin() {
		return origin;
	}

	/**
	 * Defines the value of the origin property.
	 *
	 * @param origin
	 *            allowed object is {@link String }.
	 */
	public final void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the value of the destination property.
	 *
	 * @return possible object is {@link String }.
	 */
	public final String getDestination() {
		return destination;
	}

	/**
	 * Defines the value of the destination property.
	 *
	 * @param destination
	 *            allowed object is {@link String }.
	 */
	public final void setDestination(final String destination) {
		this.destination = destination;
	}

	/**
	 * Gets the value of the text property.
	 *
	 * @return possible object is {@link String }.
	 */
	public final String getText() {
		return text;
	}

	/**
	 * Defines the value of the text property.
	 *
	 * @param text
	 *            allowed object is {@link String }.
	 */
	public final void setText(final String text) {
		this.text = text;
	}

	/**
	 * Override toString method.
	 * 
	 * @return Error to string value.
	 */
	@Override
	public String toString() {
		return "Errors [username=" + username + ", password=" + password + ", origin=" + origin + ", destination="
				+ destination + ", text=" + text + "]";
	}

}
