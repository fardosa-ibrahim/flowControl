fun main(){
   odd()
    var x=namesArray(arrayOf("benfsd","tentanzaaaaa","car","Hellos","boy"))
    println(x)
    drink(4)
    drink(12)
    drink(20)
    outcame(12)
    outcame(20)
    outcame(15)
}
fun odd(){
    for (num in 1..100) {
        if (num%2 != 0) {
            println(num)
        }
    }
}
fun namesArray(name:Array<String>):Int{
    var num=0
    name.forEach { name->
        if (name.length>5){
            num++
        }
    }
    return  num
}
fun drink(age:Int){
    if (age<6){
        println("give milk")
    }
    else if (age<=15&&age>6){
        println("give orange juice")
    }
    else{
        println("give a Coca cola")
    }
}
fun outcame(its:Int) {
    for (its in 1..100){
        if (its%3==0 && its%5==0){
            println("FizzBuzz")
        }
       else if (its%3==0){
            println("Fizz")
        }
        else if (its%5==0){
            println("Buzz")
        }
        else{
            println(its)
        }
    }

}