package vn.momo.onboard.model

class User constructor(
    var id: Int,
    var name: String,
    var age: Int
) {

    override fun toString(): String {
        return "$id $name $age"
    }
}