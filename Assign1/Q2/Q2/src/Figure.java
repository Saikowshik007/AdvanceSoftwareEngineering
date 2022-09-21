public class Figure implements Figure_interface {
    private Shape shape;
    Figure(Shape shape){
        this.shape=shape;

    }

    @Override
    public void drawFigure() {
        shape.draw();
    }
}