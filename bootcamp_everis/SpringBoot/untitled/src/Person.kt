class Person (private val firstName:String, private val lastName: String, val age: Int){
    private val fullName:String = "$firstName $lastName"
    override fun toString(): String {
        return fullName
    }
}
fun main(){
    val Rafael = Person("Rafael","Santiago", 25)
    val Daniel = Person("Daniel","Santiago", 22)
    println(Rafael)
    println(Daniel)
}