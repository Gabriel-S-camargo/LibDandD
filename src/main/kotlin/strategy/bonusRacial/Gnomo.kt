package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial
class Gnomo : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.inteligencia += 2
    }
}