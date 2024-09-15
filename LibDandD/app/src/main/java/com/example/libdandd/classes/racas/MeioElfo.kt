package classes.racas

import classes.Personagem
import interface_.Bonus

class MeioElfo(nome: String) : Personagem(nome), Bonus {

    override fun recebeBonusRacial(personagem: Personagem) {
        personagem.carisma += 2
        println("Bonus Racial do Meio-Elfo Aplicado")
    }

    override fun toString(): String {
        return super.toString() + "\nClasse: Meio-Elfo"
    }
}
