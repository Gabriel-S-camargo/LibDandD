package strategy.funcoes

import bonusRacial.BonusRacial
import strategy.bonusRacial.*

val racas: Map<String, BonusRacial?> = mapOf(
    "Alto elfo" to AltoElfo(),
    "Anão" to Anao(),
    "Anão da montanha" to AnaoDaMontanha(),
    "Anão da colina" to AnaoDaColina(),
    "Drow" to Drow(),
    "Draconato" to Draconato(),
    "Elfo" to Elfo(),
    "Elfo da floresta" to ElfoDaFloresta(),
    "Gnomo" to Gnomo(),
    "Gnomo da floresta" to GnomoDaFloresta(),
    "Gnomo das rochas" to GnomoDasRochas(),
    "Halfling" to Halfling(),
    "Halfling pés-leves" to HalflingPesLeves(),
    "Halfling robusto" to HalflingRobusto(),
    "Humano" to Humano(),
    "Meio-elfo" to MeioElfo(),
    "Meio-orc" to MeioOrc(),
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

fun converterStringParaBonusRacial(raca: String): BonusRacial? {
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

fun enviarFormulario(forca: Int, destreza: Int, constituicao: Int, inteligencia: Int, sabedoria: Int, carisma: Int): Boolean {
    val atributos = listOf(forca, destreza, constituicao, inteligencia, sabedoria, carisma)

    return if (validarFormulario(atributos)) {
        println("Personagem criado com sucesso!")
        true
    } else {
        println("Erro no envio do formulário. Verifique os pontos utilizados e tente novamente.")
        false
    }
}

// Função para calcular o custo baseado no valor do atributo
fun calcularCustoAtributo(valor: Int): Int {
    return custosAtributos.getValue(valor);
}


fun calcularPontosRestantes(atributos: List<String>): Int {
    val pontosTotais = 27
    val custoTotal = atributos.sumOf { calcularCustoAtributo(it.toInt()) }
    return pontosTotais - custoTotal
}