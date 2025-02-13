package com.carlos.hamburgeria.exception

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.client.HttpServerErrorException.InternalServerError
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler
    fun handlerInternalServerError(ex: InternalServerError): ResponseEntity<MensagemException>{
        val mensagemException = MensagemException(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            ex.message
        )

        return ResponseEntity(mensagemException, HttpStatus.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler
    fun handlerNoSuchElementExceptionException(ex: NoSuchElementException): ResponseEntity<MensagemException>{
        val mensagemException = MensagemException(
            HttpStatus.BAD_REQUEST.value(),
            ex.message
        )

        return ResponseEntity(mensagemException, HttpStatus.BAD_REQUEST)
    }
}