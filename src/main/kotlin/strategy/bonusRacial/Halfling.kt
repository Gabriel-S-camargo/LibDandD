package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Halfling : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.destreza += 2
    }
}