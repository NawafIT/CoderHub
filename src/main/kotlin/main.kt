fun main() {

    println(deleteLastChar(date = "2019/12/28"))
    
}

fun deleteLastChar(date: String): String {
    val newDate1 = date.replace(oldChar = '/', newChar = '-')
    val newDate2 = date.split('/')
    // you can make it 1 //
    var newDate3 = newDate2[newDate2.size / 2] + "/"

    for (i in newDate2.size - 1 downTo 0) {
        // you can make it 1 //
        if (i == newDate2.size / 2) continue
        newDate3 += if (i != 0) newDate2[i] + "/" else newDate2[i]
    }

    return "$date | $newDate1 | $newDate3"

}