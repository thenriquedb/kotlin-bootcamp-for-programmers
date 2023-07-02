import Aquarium.Aquarium

fun main(args: Array<String>) {
   val aquarium = Aquarium(width = 90)

    println(
        "Width: ${aquarium.width} " +
        "Height: ${aquarium.height} " +
        "Length: ${aquarium.length} "
    )

    println("Volume: ${aquarium.volume}")

    val aquarium2 = Aquarium(numberOfFish = 5)

}