package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial
class MeioOrc : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 2
        personagem.constituicao += 1
    }
}