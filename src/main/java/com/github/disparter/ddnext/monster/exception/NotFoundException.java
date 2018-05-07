package com.github.disparter.ddnext.monster.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1160040427727423327L;

	public NotFoundException() {
		super("Resource not found in our services.");
	}
}