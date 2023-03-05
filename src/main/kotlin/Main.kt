fun main() {
names()
    myName("gubo")
    foods("meat")
    places("Mombasa")
    greetings()
    letters()
    number()
    integers()
    nums()
    alphabet()
}
fun names(){
    var gubo="girl"
    var mercy="boy"
    if (gubo==mercy)
        println(true)
    else{
        println(false)
    }

}
fun myName(name:String){
    if (name.equals("gubo"))
        println("Thats me")
    else{
        println("i dont know who that is")


}
}
fun foods(food:String){
    var word="i love it"
            when(word){
               "i love"-> println("yes")
                else-> println(word)
            }
}
fun places(place:String){
    when(place){
        "Nairobi"-> println("no")
        else->println(place)

}
}
fun greetings() {
    val time=12
    if (time<10){
        println("Goodmorning")
        } else{
            println("Goodafternoon")

    }
}
fun letters(){
    var x=1;
    do {
        println(x)
        x++
    } while (x < 8)
}
fun number(){
    for (num in 1..8){
        println(num)
    }

}
fun integers(){
    for (int in 2..12){
        if (int==9){
         break
        }
          println(int)
    }

}
fun nums(){
    for (num in 1..16){
        if (num==7){
            continue
        }
        println(num)
    }
}
fun alphabet(){
    for (alp in 'a'..'z'){
        if (alp=='b'){
            continue
        }
        println(alp)
    }
}