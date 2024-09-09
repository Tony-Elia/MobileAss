//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val sq: Shape = Square("sq");
    print("Enter Square length: ");
    val l = readln().toDouble();
    print("Enter Square height: ");
    val w = readln().toDouble();

    sq.setDimensions(l, w);
    println(sq.printDetails());

    val circle: Shape = Circle("c");
    print("Enter Circle radius: ");
    val r = readln().toDouble();
    circle.setDimensions(r);
    println(circle.printDetails());

    val tri: Shape = Triangle("tri");
    print("Enter Triangle side 1: ");
    val x = readln().toDouble();
    print("Enter Triangle side 2: ");
    val y = readln().toDouble();
    print("Enter Triangle side 3: ");
    val z = readln().toDouble();
    tri.setDimensions(x, y, z);
    println(tri.printDetails());

    val equitri: Shape = EquilateralTriangle("equitri");
    print("Enter Equilateral triangle length: ");
    val j = readln().toDouble();
    equitri.setDimensions(j);
    println(equitri.printDetails());
}