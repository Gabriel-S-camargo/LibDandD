package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Tiefling : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.inteligencia += 1
        personagem.carisma += 2
    }
}