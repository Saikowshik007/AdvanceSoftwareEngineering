public abstract class Decorator implements Shape{
    protected Shape dShape;
    public Decorator(Shape decoratedShape)
    {
        this.dShape = decoratedShape;
    }
 
    public void draw() { dShape.draw(); }
}
    