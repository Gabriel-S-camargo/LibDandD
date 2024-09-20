package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class AnaoDaColina : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}