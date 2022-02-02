enum class ProductFlavors {
    VERSION1,
    VERSION2;

    fun getValue() = when (this) {
        VERSION1 -> "version1"
        VERSION2 -> "version2"
    }
}