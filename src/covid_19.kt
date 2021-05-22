fun main() {
    runnyNose()
    soreThroat("Doctors confirmed that all the patients have a sore throat")
    lossSmell()
    var x=Cases(2345432,456785434,567890)
    println(x.cases)
    println(x.deaths)
    println(x.vaccines)
   var y=Counties("Nairobi","Nakuru","Kiambu")
    println(y.countya)
    println(y.countyb)
    println(y.countyc)
    var u=Hospitals("kENYATTA","PUMWANI","MPISHA")
    println(u.x)
    println(u.r)
    println(u.t)
 println()







}

class Patients(confirmedCases:String,confirmedDeaths:String,vaccinesAdministered:String)
fun runnyNose(){
    println("All the patients have a running nose")

}
fun soreThroat(speech:String){
    println("coughing")

}
fun lossSmell(){
    println("Patients loss smell")
}

data class Cases(var cases:Int,var deaths:Int,var vaccines:Int){
    var number = deaths
    var  reported=cases
    var provided=vaccines



}
data class Counties( val countya:String,val countyb:String,val countyc:String){
    fun mentioned(){
    val i= countya
    val identity= countyb
    val v =countyc

    }}
data class  Hospitals(val x:String,val r:String,val t:String) {
    fun hospitals() {
        println("Hospitals which patients were taken")


    }
    fun affected(instuitions:String,religiousPlaces:String) {
        var mentioned="public places"
        println(mentioned)
}


}


















