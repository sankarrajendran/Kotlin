fun main(){
    println(nullCheckDemo("Sankar")?.length?:"Not available value")
    println(nullCheckDemo("dds")?.length?:"Not available value")
}

fun nullCheckDemo(name: String): String? {
    if(name == "Sankar") return "Lead Software engineer"
    return null
}