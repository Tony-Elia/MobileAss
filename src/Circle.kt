import kotlin.math.PI

class Circle(_name: String) : Shape(_name)  {
    private var radius = 0.0;

    override fun setDimensions(vararg params: Double) {
        if(params.size == 1) {
            radius = params[0];
        } else
            throw IllegalArgumentException("Circle requires 1 parameter")
    }

    override fun printDimensions() {
        println("Circle radius is $radius")
    }

    override fun getArea() = radius * radius * PI;
}