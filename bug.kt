fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    //The following code will throw ConcurrentModificationException
    val arrayList = arrayListOf(1,2,3,4,5)
    arrayList.forEach{ if(it %2 == 0) arrayList.remove(it)} 
    println(arrayList)
}