public class Client {
    public static void main(String [] args){
        //Drawing Rabbit with header and border
        Shape border= new BlackBorder(new Rabbit());
        Shape header= new Header(border);
        Composite comp= new Composite();
        Figure fig1= new Figure(header);

        // Drawing Rabbit_Text_box with border
        Shape rabbit_text_box= new Rabbit_Text_box();
        Shape border2= new BlackBorder(rabbit_text_box);
        Figure fig2= new Figure(border2);

        //Merging Both the figures
        Composite comp1= new Composite();
        comp1.addFigure(fig2);
        comp1.addFigure(fig1);

        //Drawing Empty_text_box with header and border
        Shape border3= new BlackBorder(new Empty_text_box());
        Shape header3=new Header(border3);
        Figure fig3= new Figure(header3);
        Composite comp2= new Composite();
        comp2.addFigure(fig3);
        //Drawing header and border
        Shape border4= new BlackBorder(new Canvas());
        Shape header4= new Header(border4);
        Figure fig4= new Figure(header4); 
        comp.addFigure(fig4);
        comp.addComp(comp1);
        comp.addComp(comp2);
        //comp.addFigure();
        comp.drawFigure();
    }


}
