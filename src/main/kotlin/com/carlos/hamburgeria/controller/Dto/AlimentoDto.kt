package com.carlos.hamburgeria.controller.Dto

import com.carlos.hamburgeria.domain.Alimento
import java.math.BigDecimal

class AlimentoDto (
    val nome: String,
    val descricao: String,
    val preco: BigDecimal,
    val categoria: String
) {
    fun paraDominio(): Alimento {
        return Alimento(
            id = null,
            nome = nome,
            descricao = descricao,
            preco = preco,
            categoria = categoria
        )
    }
}