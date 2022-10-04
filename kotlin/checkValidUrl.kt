val regex = "([A-Za-z]*:\\/\\/)?\\S*".toRegex()

fun isValidUrl(url: String): Boolean {
    return regex.containsMatchIn(url)
}
