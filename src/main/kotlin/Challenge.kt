fun main() {
    val order = namesSort(
        namesArray = mutableListOf("Khaled Bader", "Khaled Bader", "Mohammed Yahya"), order = "ASC"
    )
    println(order)
}

fun namesSort(namesArray: MutableList<String>, order: String): MutableList<String> {

    return if (order == "DESC") {
        namesArray.sortedDescending().toMutableList()
    } else {
        namesArray.sorted().toMutableList()
    }
}

