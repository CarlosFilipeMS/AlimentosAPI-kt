package com.carlos.hamburgeria.controller.Dto

import com.carlos.hamburgeria.domain.Alimento
import org.jetbrains.annotations.NotNull
import java.math.BigDecimal

class AlimentoDto (
    @field:NotNull
    val nome: String,
    @field:NotNull
    val descricao: String,
    @field:NotNull
    val preco: BigDecimal,
    @field:NotNull
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