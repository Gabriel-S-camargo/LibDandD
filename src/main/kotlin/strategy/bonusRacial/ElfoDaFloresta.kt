package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class ElfoDaFloresta : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}