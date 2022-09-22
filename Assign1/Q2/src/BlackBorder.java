public class BlackBorder extends Decorator {

    public BlackBorder(Shape dShape) {
        super(dShape);
    }
    @Override
    public void draw(){
        dShape.draw();
        setBlackBorder(dShape);
    }
    private void setBlackBorder(Shape decoratedShape)
        {
            System.out.println("Border has been added and it's Color is Black!");
        }
    }
