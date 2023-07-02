package Aquarium

class Fish(friendly: Boolean = true, volumeNeeded:Int ) {
    val size: Int

    init {
        size = if (friendly) volumeNeeded else volumeNeeded * 2
    }
}