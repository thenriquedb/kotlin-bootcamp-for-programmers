import Aquarium

fun main(args: Array<String>) {
   val aquarium = Aquarium()

    println(
        "Width: ${aquarium.width}" +
        "Height: ${aquarium.height}" +
        "Length: ${aquarium.length}"
    )

    println("Volume: ${aquarium.volume}")
}