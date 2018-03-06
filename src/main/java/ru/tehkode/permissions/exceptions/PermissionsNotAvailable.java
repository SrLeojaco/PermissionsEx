package ru.tehkode.permissions.exceptions;


public class PermissionsNotAvailable extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -7091217194503387722L;

	public PermissionsNotAvailable() {
		super("Permissions manager is not accessable. Is the PermissionsEx plugin enabled?");
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}


}
