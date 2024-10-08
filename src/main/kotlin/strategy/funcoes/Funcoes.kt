package strategy.funcoes

import Personagem
import bonusRacial.BonusRacial
import strategy.bonusRacial.*

val racas: Map<String, BonusRacial> = mapOf(
    "Alto Elfo" to AltoElfo(),
    "Anão" to Anao(),
    "Anão da Montanha" to AnaoDaMontanha(),
    "Anão da Colina" to AnaoDaColina(),
    "Drow" to Drow(),
    "Draconato" to Draconato(),
    "Elfo" to Elfo(),
    "Elfo da Floresta" to ElfoDaFloresta(),
    "Gnomo" to Gnomo(),
    "Gnomo da Floresta" to GnomoDaFloresta(),
    "Gnomo das Rochas" to GnomoDasRochas(),
    "Halfling" to Halfling(),
    "Halfling Pés-Leves" to HalflingPesLeves(),
    "Halfling Robusto" to HalflingRobusto(),
    "Humano" to Humano(),
    "Meio-Elfo" to MeioElfo(),
    "Meio-Orc" to MeioOrc(),
    "Tiefling" to Tiefling()
)

val custosAtributos = mutableMapOf(
    0 to 8,
    1 to 9,
    2 to 10,
    3 to 11,
    4 to 12,
    5 to 13,
    7 to 14,
    9 to 15
)

fun converterStringParaBonusRacial(raca: String): BonusRacial {
    return racas.getValue(raca)
}

private fun validarFormulario(atributos: List<Int>): Boolean {
    val pontosDisponiveis = 27
    var pontosUsados = 0

    if (atributos.any { it !in 8..15 }) {
        println("Erro: Todos os atributos devem estar entre 8 e 15.")
        return false
    }

    for(atributo in atributos){
        val custo = custosAtributos.getValue(atributo)

        pontosUsados += custo
    }


    return if (pontosUsados > pontosDisponiveis) {
        false
    } else {
        true
    }
}

fun criarPersonagem(nome : String, bonusRacial: BonusRacial,forca: Int, destreza: Int, constituicao: Int, inteligencia: Int, sabedoria: Int, carisma: Int): Personagem {
    val atributos = listOf(forca, destreza, constituicao, inteligencia, sabedoria, carisma)

    var personagem = Personagem(bonusRacial)

    personagem.nome = nome
    personagem.forca = forca
    personagem.destreza = destreza
    personagem.constituicao = constituicao
    personagem.inteligencia = inteligencia
    personagem.sabedoria = sabedoria
    personagem.carisma = carisma
    personagem.aplicarBonusEVida(personagem)

    return personagem
}

fun calcularCustoAtributo(valor: Int): Int {
    return when (valor) {
        8 -> 0
        9 -> 1
        10 -> 2
        11 -> 3
        12 -> 4
        13 -> 5
        14 -> 7
        15 -> 9
        else -> throw IllegalArgumentException("Valor de atributo inválido")
    }
}

fun calcularPontosRestantes(atributos: List<String>): Int {
    val pontosTotais = 27
    val custoTotal = atributos.sumOf { calcularCustoAtributo(it.toInt()) }
    return pontosTotais - custoTotal
}
