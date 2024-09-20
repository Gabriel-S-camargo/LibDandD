package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class HalflingPesLeves : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.carisma += 1
    }
}