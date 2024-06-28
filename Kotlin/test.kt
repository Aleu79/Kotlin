var dami:String = "Hola profe"
var peñaBad:String = "Hola profesito"
fun main (){
    println(dami.toString())
    println(dami.compareTo("Hola rocio"))
    if(dami.equals("Hola gutierrez")){
        println("que raro")
    }
    println(dami.get(1))
    println(dami.hashCode())
    println(dami.plus(", bien"))
    println(dami.substring(0,3))
    println(dami.toUpperCase())
    println(dami.toLowerCase())
    println(dami.indexOf('e'))
    println(dami.lastIndexOf('m'))
}
