package ma.cigma.Safariyat.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public final ResponseEntity<Object> handleUtilisateurUsernameException(UtilisateurUsernameException ex,WebRequest request){
		
		UtilisateurUsernameExceptionResponse exceptionResponse = new UtilisateurUsernameExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleOffreIdException(OffreIdException ex, WebRequest request){
		
		OffreIdExceptionResponse exceptionResponse = new OffreIdExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleReservationIdException(ReservationIdException ex, WebRequest request){
		
		ReservationIdExceptionResponse exceptionResponse = new ReservationIdExceptionResponse(ex.getMessage());
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
