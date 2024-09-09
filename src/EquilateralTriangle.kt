class EquilateralTriangle(_name: String) : Triangle(_name) {
    override fun setDimensions(vararg params: Double) {
        if(params.size == 1) {
            super.setDimensions(params[0], params[0], params[0]);
        } else
            throw IllegalArgumentException("Equilateral Triangle requires 1 parameter")
    }
}