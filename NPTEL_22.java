public  class NPTEL_22 {
    public static void main(String[] args) {
        Square square= new Square();
        square.side= 8;

        System.err.println("The area of the square is: " + square.area());
    }
}

class Square
{
    int side;

    int area()
    {
        return side*side;
    }
}