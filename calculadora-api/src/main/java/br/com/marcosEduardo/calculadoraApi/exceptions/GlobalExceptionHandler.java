package br.com.marcosEduardo.calculadoraApi.exceptions;

import br.com.marcosEduardo.calculadoraApi.dto.ErroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
    @ExceptionHandler(DivisaoPorZeroException.class)

    public ResponseEntity<ErroDTO> tratarDivisaoPorZero(DivisaoPorZeroException exception) {

        ErroDTO erro = new ErroDTO(exception.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(erro);
    }
}
