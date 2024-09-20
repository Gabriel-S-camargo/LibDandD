package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Elfo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.destreza += 2
    }
}