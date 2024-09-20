package strategy.bonusRacial
import Personagem
import bonusRacial.BonusRacial

class Humano : BonusRacial {
    override fun aplicarBonusRacial(personagem: Personagem) {
        personagem.forca += 1
        personagem.carisma += 1
        personagem.destreza += 1
        personagem.sabedoria += 1
        personagem.constituicao += 1
        personagem.inteligencia += 1
    }
}