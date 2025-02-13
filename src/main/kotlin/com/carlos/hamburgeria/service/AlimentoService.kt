package com.carlos.hamburgeria.service

import com.carlos.hamburgeria.controller.Dto.AlimentoDto
import com.carlos.hamburgeria.domain.Alimento
import com.carlos.hamburgeria.repository.AlimentoRepository
import org.springframework.stereotype.Service

@Service
class AlimentoService(
    private val alimentoRepository: AlimentoRepository
) {


    fun salvar(alimentoDto: AlimentoDto): Alimento {
        return alimentoRepository.save(alimentoDto.paraDominio())
    }

    fun buscarTodos(): List<Alimento> {
        return alimentoRepository.findAll()
    }

    fun buscarComFiltro(pesquisa: String): Alimento {
        val id = pesquisa.toLongOrNull()
        if(id == null){
            return alimentoRepository.findByNome(pesquisa)
        }else{
            return alimentoRepository.findeById(id)
        }
    }

    fun deletar(id: Long) {
        alimentoRepository.delete(id)
    }

    fun atualizar(id: Long, alimentoDto: AlimentoDto): Alimento?{
        return alimentoRepository.update(id, alimentoDto)

    }
}