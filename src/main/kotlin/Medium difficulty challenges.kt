
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*
import kotlin.math.exp
import kotlin.math.sqrt

fun main() {
//    sub_arrays(arr1 = mutableListOf(2, 4, 88), arr2 = mutableListOf(4, 2, 88))
//    println(countWords(txt = "Plant hope in the hearts of others"))
//    println(sortByLength(txt = "a Have a wonderful an day"))
//    println(count_ones(num = 112))
//    println(removeSpecialCharacters(strParam = "Are_u?_com?ing!"))
//    println(word_length(mutableListOf("Hello","Welcome")))
//    println(unique(arr = mutableListOf(1, 2, 3, 1, 2, 3, 5, 6, 7, 5)))
//    println(max_element(arr = mutableListOf(3, 5, 2, 1, 7, 8, 111, 2, 3)))
//    println(smallest_number(arr = mutableListOf(2, 4, 56, 2, 0, 4, 2)))
//    println(cumulative_sum(arr = mutableListOf(1, 2, 3, 4, 5)))
//    println(hasSpace(strParam = "Hello There"))
//    println(date_formating(date = "2020-09-01"))
//    println(longestZero(strParam = "100001010100010"))

//    println(missingLetter(txt = "abcd"))
//    println(middle_char(word = "salem"))


//    println(most_frequent_element(arr = mutableListOf(1,2,3,4,1,5,-5,-5,-5,-5,-5,6)))
//    println(array_root(arr = mutableListOf(4.0,81.0,49.0)))
//    println(first_n_vowels(phrase = "Riyadh", n = 2))
//    println(oddsVsEvens(num = 54870))
//    println(math_expr(expr = "6/1"))
//    println(find_element(elements_array = mutableListOf(2,12,34,2,3,4,5),element = 4))
//    println(compare_two_words(s1 = "plant", s2 = "planet"))
}



fun sort_array( my_array: MutableList<Int>,  typeParam: String):MutableList<Int> {
    if("B" == typeParam){
        return my_array.sortedDescending().toMutableList()
    }else{
        return my_array.sorted().toMutableList()
    }

}







//fun sort_array( elements_array: MutableList<Int>):MutableList<Int> {
//    // write your code here
//    return elements_array.sorted().toMutableList()
//
//
//}
//fun largest_smallest( array_values: MutableList<Int>):MutableList<Int> {
//
//    return mutableListOf(array_values.maxOf { it } , array_values.minOf { it })
//
//}

//fun compare_two_words(s1: String, s2: String): Boolean {
//    return s1.substring(
//        startIndex = s1.length - 2,
//        endIndex = s1.length
//    ) == s2.substring(
//        startIndex = s2.length - 2, endIndex = s2.length
//    )
//
//}


//fun find_element( elements_array: MutableList<Int>,  element: Int):Boolean {
//    return element in elements_array
//
//}


//fun math_expr( expr: String):Boolean {
//    // write your code here
//    val c = mutableListOf('/' , '+' , '-', '%')
//    val expr1 = expr.toMutableList()
//    val t = expr1[0].isDigit() && expr1[2].isDigit() && expr1[1] in c
//    return t
//
//}


//fun oddsVsEvens(num: Int): String {
//    val n = num.toString().toMutableList()
//    var even = 0
//    var odd = 0
//    for (i in n) {
//        if (i.toString().toInt() % 2 == 0) {
//            even += i.toString().toInt()
//        } else {
//            odd += i.toString().toInt()
//        }
//    }
//    return if (even < odd) {
//        "odd"
//    } else if (even > odd) {
//        "even"
//    } else{
//        "equal"
//    }
//}


//fun first_n_vowels(phrase: String, n: Int): String {
//    val word = mutableListOf('i', 'o', 'u', 'e', 'a')
//    var counter = 0
//    var letter = ""
//    for (i in phrase) {
//        for (j in word) {
//            if (i.lowercase() == j.lowercase()) {
//                counter++
//                letter += i
//            }
//        }
//    }
//    return if (counter == n) {
//        letter
//    } else {
//        "invalid "
//    }
//
//}


//fun array_root( arr: MutableList<Double>):MutableList<Double> {
//    // write your code here
//    val list = mutableListOf<Double>()
//    for (i in arr){
//        list.add(String.format("%.2f",sqrt(i)).toDouble())
//    }
//    return list
//
//}


//fun most_frequent_element(arr: MutableList<Int>): Int {
//    var maxcount = 0
//    var element_having_max_freq = 0
//    for (i in 0 until arr.size) {
//        var count = 0
//        for (j in 0 until arr.size) {
//            if (arr[i] == arr[j]) {
//                count++
//            }
//        }
//        if (count > maxcount) {
//            maxcount = count
//            element_having_max_freq = arr[i]
//        }
//    }
//    return element_having_max_freq
//
//}



//fun middle_char(word: String): String {
//    val num = word.length / 2
//    return if (word.length % 2 == 0) {
//        "${word[num - 1]}${word[num]}"
//    } else {
//        "${word[num]}"
//    }
//}


//fun missingLetter(txt: String): String {
//    val word = txt.toMutableList()
//    var counter = 0
//    val letter = word[0]..'z'
//
//    for (i in letter) {
//        if (counter == word.size) {
//            break
//        }
//        if (word[counter] != i) {
//            return i.toString()
//        }
//        counter++
//    }
//    return "No Missing Letter"
//}


//fun longestZero(strParam: String): String {
//    // write your code here
//    val newWord = strParam.split('1')
//    val numberOfZero: (String) -> Int = {
//        it.length
//    }
//    val result = newWord.sortedBy(numberOfZero)
//    return result.last()
//
//}


//fun date_formating(date: String): String {
//    // write your code here
//    val newDate = date.split('-')
//    var lastDate = ""
//    for (i in newDate.size - 1 downTo 0) {
//        lastDate += if (i != 0) "${newDate[i]}-" else newDate[i]
//    }
//    return lastDate
//}


//fun hasSpace( strParam: String):String {
//    return strParam.replace(oldChar = ' ', newChar = '#')
//
//}


//fun cumulative_sum(arr: MutableList<Int>): MutableList<Int> {
//    // write your code here
//    val sumNumbers = mutableListOf<Int>()
//    val finalResult = arr.reduce { i, acc ->
//        sumNumbers.add(i)
//        i + acc
//    }
//    sumNumbers.add(finalResult)
//    return sumNumbers
//}


//fun smallest_number(arr: MutableList<Int>): Int {
//    return arr.minOf { it }
//
//}


//fun max_element(arr: MutableList<Int>): Int {
//    // two solutions both correct:
//    //arr.sorted().last()
//    return arr.maxOf { it }
//
//}


//fun unique(arr: MutableList<Int>): MutableList<Int> {
//    val numbersList = mutableListOf<Int>()
//    for (i in arr.indices) {
//        var counter = 0
//
//        for (j in arr.indices) {
//            if (arr[i] == arr[j]) {
//                counter++
//            }
//        } // end second loop
//
//        if (counter == 1) {
//            numbersList.add(arr[i])
//        }
//    } // end first loop
//    return numbersList
//}


//fun word_length( arr: MutableList<String>):MutableList<Int> {
//
//    val lengthStrings = mutableListOf<Int>()
//    arr.forEach { lengthStrings.add(it.length) }
//    return lengthStrings
//
//}


//fun removeSpecialCharacters(strParam: String): String {
//    val listChar = mutableListOf(
//        '$', '،', '!', '@', '#', '?', '=', '@', '^', '&', '*', '(', ')', '=', '+', '/',
//        '|', '\'', '<', '>', ':', ';', '"', '{', '}', '[', ']', '%', '.'
//    )
//    return strParam.filterNot { it in listChar }
//
//}


//
//fun count_ones(num: Int): Int {
//    val ones = mutableListOf<Int>()
//    var number = num
//    while (number != 0) {
//
//        if (number % 2 != 0) {
//            ones.add(number % 2)
//        }
//        number /= 2
//    }
//
//    return ones.size
//}
//fun sortByLength(txt: String): String {
//    var text = txt.split(" ")
//    val selector: (String) -> Int = { str ->
//        str.length
//    }
//    text = text.sortedBy(selector = selector)
//    var newWord = ""
//    text.forEach { newWord += if (text[text.size - 1] == it) it else "$it " }
//    return newWord
//
//}


//fun kSumSubset(numArray: MutableList<Int>, k: Int): Boolean {
//    val n = numArray.sorted()
//    for (i in n.indices) {
//        for (j in i + 1 until n.size) {
//            var sum = n[i]
//            for (y in j until n.size) {
//                sum += n[y]
//                if (sum == k) return true
//            }
//
//        }
//    }
//    return false
//}


//fun countWords( txt: String):Int {
//    return txt.split(" ").size
//}


//fun sub_arrays(arr1: MutableList<Int>, arr2: MutableList<Int>): MutableList<Int> {
//    val arr = mutableListOf<Int>()
//    for (i in arr1.indices) {
//        arr.add(arr2[i] - arr1[i])
//    }
//    return arr
//
//}

