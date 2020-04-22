fun Hamming(Str1:String, Str2:String):Int{
    var Distance:Int = 0
    for(i in 0 until Str1.length){
        if(Str1[i].equals(Str2[i]))
        else Distance++
    }
    return Distance
}

fun main(){
    var DNA1:String = "GAGCCTACTAACGGGAT"
    var DNA2:String = "CATCGTAATGACGGCCT"
    var Result:Int = Hamming(DNA1, DNA2)
    println(Result)
}
