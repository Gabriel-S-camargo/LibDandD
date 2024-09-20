package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class GnomoDasRochas : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.constituicao += 1
    }
}