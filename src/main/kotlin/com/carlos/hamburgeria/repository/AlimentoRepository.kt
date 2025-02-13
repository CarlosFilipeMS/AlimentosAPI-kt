package com.carlos.hamburgeria.repository

import com.carlos.hamburgeria.controller.Dto.AlimentoDto
import com.carlos.hamburgeria.domain.Alimento

interface AlimentoRepository {
    fun save(alimento: Alimento): Alimento

    fun findAll(): List<Alimento>
    fun findByNome(pesquisa: Any): Alimento
    fun findeById(id: Any): Alimento
    fun delete(id: Long)
    fun update(id: Long, alimentoDto: AlimentoDto): Alimento?
}