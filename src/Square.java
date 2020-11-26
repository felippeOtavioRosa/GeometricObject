public class Square implements RegularPolygon {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLenght() {
        return sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLenght=" + sideLength +
                "numSide=" + getNumSides() +
                '}';
    }
}
