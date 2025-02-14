package com.carlos.hamburgeria.repository

import com.carlos.hamburgeria.controller.Dto.AlimentoDto
import com.carlos.hamburgeria.domain.Alimento

interface AlimentoRepository {

    fun save(alimento: Alimento): Alimento
    fun findAll(): List<Alimento>
    fun findByNome(pesquisa: String): Alimento
    fun findById(id: Long): Alimento
    fun delete(id: Long)
    fun update(id: Long, alimentoDto: AlimentoDto): Alimento?

}