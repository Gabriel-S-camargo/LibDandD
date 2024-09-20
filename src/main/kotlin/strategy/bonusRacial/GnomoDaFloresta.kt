package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class GnomoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.destreza += 1
    }
}