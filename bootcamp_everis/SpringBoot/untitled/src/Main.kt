data class User(val firstName:String, val lastName: String)
class Main {
}
fun main() {
    val rafael = User("Rafael", "Santiago")
    val laura = User("Laura", "Campos")
    val pessoas: MutableList<User> = mutableListOf(rafael, laura)
    pessoas.forEach { user ->
        println("${user.firstName} ${user.lastName} is attending")
    }
}