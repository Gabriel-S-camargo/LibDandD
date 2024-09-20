import bonusRacial.BonusRacial

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



}
