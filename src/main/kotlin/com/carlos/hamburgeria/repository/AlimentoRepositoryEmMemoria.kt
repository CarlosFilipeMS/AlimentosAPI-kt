package com.carlos.hamburgeria.repository

import com.carlos.hamburgeria.controller.Dto.AlimentoDto
import com.carlos.hamburgeria.domain.Alimento
import org.springframework.stereotype.Component

@Component
class AlimentoRepositoryEmMemoria(): AlimentoRepository {
    private val alimentoLista: MutableList<Alimento>
    private var indice  : Long = 0

    init{
        alimentoLista = ArrayList()
    }

    override fun save(alimento: Alimento): Alimento {
        indice ++
        alimento.id = indice
        alimentoLista.add(alimento)
        return alimento
    }

    override fun findAll(): List<Alimento>{
        return alimentoLista
    }

    override fun findByNome(pesquisa: Any): Alimento {
        return alimentoLista.first{it.nome == pesquisa}
    }

    override fun findeById(id: Any): Alimento {
        return alimentoLista.first{it.id == id}
    }

    override fun delete(id: Long) {
        alimentoLista.removeIf{it.id == id}
    }

    override fun update(id: Long, alimentoDto: AlimentoDto): Alimento? {
        var alimentoAtualizado: Alimento? = null
        alimentoLista.forEachIndexed{ index, alimento ->
            if(alimento.id == id) {
                alimentoLista[index] = alimento.copy(
                    nome = alimentoDto.nome,
                    descricao = alimentoDto.descricao,
                    preco = alimentoDto.preco,
                    categoria = alimento.categoria
                )
            }
            alimentoAtualizado = alimentoLista[index]
        }
        return alimentoAtualizado
    }
}