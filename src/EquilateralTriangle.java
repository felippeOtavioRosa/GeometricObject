public class EquilateralTriangle implements RegularPolygon{
    private int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return 3;
    }

    public int getSideLenght() {
        return sideLength;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideLength=" + sideLength +
                "numSide=" + getNumSides() +
                '}';
    }
}
