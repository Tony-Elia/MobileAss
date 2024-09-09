class Square(_name: String) : Shape(_name)  {
    private var length = 0.0;
    private var height = 0.0;

    override fun setDimensions(vararg params: Double) {
        if(params.size == 2) {
            length = params[0];
            height = params[1];
        } else
            throw IllegalArgumentException("Square requires 2 parameters")
    }

    override fun printDimensions() {
        println("Square length and height respectively: $length, $height")
    }

    override fun getArea() = length * height;
}