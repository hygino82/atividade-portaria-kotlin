package control

import bussines.ConviteBusiness

class Portaria {
    private val conviteBusiness = ConviteBusiness()

    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")

        if (idade < 18) {
            return "Negado. Menores de idade não são permitidos."
        }


        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        if (!conviteBusiness.tipoValido(tipoConvite)) {
            return "Negado. Convite inválido."
        }

        val codigo = Console.readString("Qual é código do convite? ")
        if (!conviteBusiness.codigoValido(codigo,tipoConvite)) {
            return "Negado. Convite inválido."
        }

        return "TODO"
    }
}