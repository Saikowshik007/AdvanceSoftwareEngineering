public class Header extends Decorator {

        public Header(Shape dShape) {
            super(dShape);
        }
        @Override
        public void draw(){
            dShape.draw();
            setBlackBorder(dShape);
        }
        private void setBlackBorder(Shape decoratedShape)
            {
                System.out.println("Header has been added to the figure!");
            }
}
