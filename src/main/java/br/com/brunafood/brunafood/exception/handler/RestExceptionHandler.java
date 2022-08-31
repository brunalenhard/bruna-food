package br.com.brunafood.brunafood.exception.handler;

import br.com.brunafood.brunafood.exception.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@Component
@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handleBaseException(BaseException baseException) {
        return new ResponseEntity<ErrorDetails>( new ErrorDetails(baseException.getMessage(), new Date().getTime(), baseException.getStatus()
                .value()), baseException.getStatus());
    }
}
