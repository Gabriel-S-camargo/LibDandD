package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Drow : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.carisma += 1
    }
}