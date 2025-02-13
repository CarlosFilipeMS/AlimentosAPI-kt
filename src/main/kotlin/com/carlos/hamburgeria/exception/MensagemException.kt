package com.carlos.hamburgeria.exception

data class MensagemException(
    val status: Int,
    val mensagem: String?
) {
}