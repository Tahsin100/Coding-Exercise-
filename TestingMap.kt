class TestingMap {
    companion object {}

    fun run() {
        val mutableMap = mutableMapOf<String, Double>()

        mutableMap["first"] = 9.0

        var mutableMap2 = mutableMapOf<String, Double>()

        mutableMap2["first"] = 9.0

        mutableMap2.forEach {
            if (it.key == "first")
                mutableMap[it.key] = mutableMap[it.key]?.plus(it.value)!!
        }

        mutableMap2 = mutableMap

        println(mutableMap2["first"])
    }
}