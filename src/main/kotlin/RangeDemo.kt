 fun main(){
     rangeDemo()
     rangeUntilDemo()
     rangeWithStepDemo()
     rangeWithList()
     rangeListWithIndex()
     rangeListWithDestructuring()
 }

 fun rangeDemo(){
     for(x in 1..3){
         print(x)
     }
     println()
     println("Range 1..3 completed.")
 }

 /**
  * In until , process will happen less than the end value, not equal to.
  */
 fun rangeUntilDemo(){
     for(x in 4.until(5)){
         print(x)
     }
     println()
     println("Range until() completed")
 }

 fun rangeWithStepDemo(){
     for(x in 1..10 step 2){
         print("$x")
     }
     println()
     println("Range step method completed")
 }

 val names = listOf<String>("Sankar","Anu","Siva")
 fun rangeWithList(){

     for(name in names){
         print(name)
     }
     println()
     println("Range with list")
 }

 fun rangeListWithIndex(){
     for(name in names.withIndex()){
         print(name)
     }
     println()
     println("Range list with index")
 }

 fun rangeListWithDestructuring(){
     for((i, name) in names.withIndex()){
         print("$i$name ")
     }
     println()
     println("Range list with index Destructuring")
 }