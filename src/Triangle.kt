import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name)  {
    private var side1 : Double = 0.0;
    private var side2 : Double = 0.0;
    private var side3 : Double = 0.0;

    override fun setDimensions(vararg params: Double) {
        if(params.size == 3) {
            side1 = params[0];
            side2 = params[1];
            side3 = params[2];
        } else
            throw IllegalArgumentException("Triangle requires 3 parameters")
    }

    override fun printDimensions() {
        println("Triangle three sides are: $side1, $side2, $side3")
    }

    override fun getArea(): Double {
        val s =  0.5 * (side1 + side2 + side3);
        val res = (s * (s - side1) * (s - side2) * (s - side3));
        return sqrt(res);
    }
}