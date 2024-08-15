package br.com.zaine.vendas.online.exception;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 5222571349847309908L;

	public BadRequestException(String message) {
        super(message);
    }

}
