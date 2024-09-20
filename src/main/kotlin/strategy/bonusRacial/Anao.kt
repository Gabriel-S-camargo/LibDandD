package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Anao : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.constituicao += 2
    }
}