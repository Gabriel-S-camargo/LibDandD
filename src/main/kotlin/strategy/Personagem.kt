import bonusRacial.BonusRacial

import strategy.bonusRacial.*

class Personagem (val bonusRacial: BonusRacial){
    var pontosDisponiveis = 27
    var forca = 8
    var destreza = 8
    var constituicao = 8
    var inteligencia = 8
    var sabedoria = 8
    var carisma = 8
    var vida = 10

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

    val valorModificador: Map<Int, Int> = mapOf(
        1 to -5, 2 to -4, 3 to -4,
        4 to -3, 5 to -3, 6 to -2,
        7 to -2, 8 to -1, 9 to -1,
        10 to 0, 11 to 0, 12 to 1,
        13 to 1, 14 to 2, 15 to 2,
        16 to 3, 17 to 3, 18 to 4,
        19 to 4, 20 to 5, 21 to 5,
        22 to 6, 23 to 6, 24 to 7,
        25 to 7, 26 to 8, 27 to 8,
        28 to 9, 29 to 9, 30 to 10
    )

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

    fun verificaPontosDisponiveis(personagem: Personagem) : Int{

        return personagem.pontosDisponiveis;
    }

    private fun aplicarBonusRacial(personagem: Personagem) : Personagem{
        personagem.bonusRacial.aplicarBonusRacial(this)

        return personagem
    }

    private fun calcularVida(personagem: Personagem){
        val modificadorConstituicao = valorModificador.getValue(constituicao)
        vida += modificadorConstituicao
    }

    fun aplicarBonusEVida(personagem: Personagem) : Personagem{

        aplicarBonusRacial(personagem)

        calcularVida(personagem)

        return personagem
    }

    fun converterStringParaBonusRacial(raca: String): BonusRacial? {
        return racas.getValue(raca)
    }

    private fun validarFormulario(atributos: List<Int>): Boolean {
        val pontosDisponiveis = 27
        var pontosUsados = 0

        // Verifica se algum atributo está fora do intervalo permitido
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




}
