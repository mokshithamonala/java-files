class Shape {
    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double width, double length) {
        return width * length;
    }
}

class Circle extends Shape {
    @Override
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

class Tools {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();

        System.out.println("Area of square (side 4): " + s.calculateArea(4));
        System.out.println("Area of rectangle (4x3): " + s.calculateArea(4, 3));
        System.out.println("Area of circle (radius 2): " + c.calculateArea(2));
    }
}
