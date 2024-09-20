package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Draconato : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 2
        personagem.carisma += 1
    }
}