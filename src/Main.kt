//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val sq: Shape = Square("sq");
    sq.setDimensions(5.0, 2.0);
    println(sq.printDetails());

    val circle: Shape = Circle("c");
    circle.setDimensions(5.0);
    println(circle.printDetails());

    val tri: Shape = Triangle("tri");
    tri.setDimensions(1.0, 1.0, 1.0);
    println(tri.printDetails());

    val equitri: Shape = EquilateralTriangle("equitri");
    equitri.setDimensions(5.0);
    println(equitri.printDetails());
}