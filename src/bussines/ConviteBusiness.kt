package bussines

class ConviteBusiness {
    fun tipoValido(tipo: String) =
        (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(codigo: String, tipo: String): Boolean {
        return if (tipo == "comum" && codigo.startsWith("xt")) {
            true
        } else if ((tipo == "premium" || tipo == "luxo") && codigo.startsWith("xl")
        ) {
            true
        } else {
            false
        }
    }
}