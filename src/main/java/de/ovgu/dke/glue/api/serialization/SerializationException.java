package de.ovgu.dke.glue.api.serialization;

import net.jcip.annotations.Immutable;

@Immutable
public class SerializationException extends Exception {
	private static final long serialVersionUID = 4621980971205449774L;

	public SerializationException() {
	}

	public SerializationException(String msg) {
		super(msg);
	}

	public SerializationException(Throwable cause) {
		super(cause);
	}

	public SerializationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
