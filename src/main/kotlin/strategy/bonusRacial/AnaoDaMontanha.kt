package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class AnaoDaMontanha : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 2
    }
}