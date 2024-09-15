package classes.racas

import classes.Personagem
import interface_.Bonus

class HalfingPesLeves(nome: String) : Personagem(nome), Bonus {

    override fun recebeBonusRacial(personagem: Personagem) {

        personagem.carisma += 1
        println("Bonus Racial do Halfing Pés-Leves Aplicado")
    }

    override fun toString(): String {
        return super.toString() + "\nClasse: Halfing Pés-Leves"
    }
}
