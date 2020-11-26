public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle (double radious){
        super(radious);
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent /100;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                super.toString() +
                '}';
    }
}
