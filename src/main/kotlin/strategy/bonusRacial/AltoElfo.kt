package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class AltoElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.inteligencia += 1
    }
}