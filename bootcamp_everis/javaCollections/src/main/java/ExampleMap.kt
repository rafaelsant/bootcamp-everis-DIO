import kotlin.jvm.JvmStatic
import java.util.HashMap

object ExampleMap {
    @JvmStatic
    fun main(args: Array<String>) {
        //não extende Java util collection
        //HashMap
        //HashTable
        //TreeMap
        //entrada chave e valor
        //permite valores repetidos, mas não chaves repetidas
        //permite adição,busca por chave ou valor,atualização,remoção e navegação
        //pode ser ordenado
        val campeoesMundialFifa: MutableMap<String, Int> = HashMap()
        campeoesMundialFifa["Brasil"] = 5
        campeoesMundialFifa["Alemanha"] = 4
        campeoesMundialFifa["Itália"] = 4
        campeoesMundialFifa["Argentina"] = 2
        campeoesMundialFifa["Inglaterra"] = 1
        campeoesMundialFifa["França"] = 2
        campeoesMundialFifa["Uruguai"] = 2
        campeoesMundialFifa["Espanha"] = 1
        println(campeoesMundialFifa)
    }
}