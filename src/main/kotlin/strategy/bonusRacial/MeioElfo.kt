package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class MeioElfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.carisma += 2
    }
}