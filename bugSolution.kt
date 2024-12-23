fun main() {
    val arrayList = arrayListOf(1, 2, 3, 4, 5)

    // Safe way 1: Using iterator().remove()
    val iterator = arrayList.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println("Safe way 1: "+arrayList) // Output: [1, 3, 5]

    // Safe way 2: Create a new list
    val arrayList2 = arrayListOf(1, 2, 3, 4, 5)
    val newList = arrayList2.filter { it % 2 != 0 }
    println("Safe way 2: " + newList) // Output: [1, 3, 5]

    //Safe way 3: Using removeIf
    val arrayList3 = arrayListOf(1, 2, 3, 4, 5)
    arrayList3.removeAll { it % 2 == 0 }
    println("Safe way 3: " + arrayList3) //Output: [1,3,5]

    //Safe way 4: Iterate over a copy
    val arrayList4 = arrayListOf(1,2,3,4,5)
    val arrayList4Copy = ArrayList(arrayList4)
    for(item in arrayList4Copy) {
        if(item % 2 == 0) arrayList4.remove(item)
    }
    println("Safe way 4: " + arrayList4) //Output: [1,3,5]
}