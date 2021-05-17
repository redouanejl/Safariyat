package ma.cigma.Safariyat.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ImageException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ImageException(String message) {
		super(message);
	}

}
