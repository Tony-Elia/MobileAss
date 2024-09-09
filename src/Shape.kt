abstract class Shape (_name : String) : Dimensionable {
    var name = _name

    open fun getArea(): Double {
        return 0.0;
    }

    fun printDetails() {
        println("Name: $name")
        this.printDimensions()
        println("Area: ${getArea()}")
    }
}