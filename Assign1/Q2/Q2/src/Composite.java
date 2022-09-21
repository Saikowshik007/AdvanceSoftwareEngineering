import java.util.ArrayList;
import java.util.List;

public class Composite implements Figure_interface {
    private List<ArrayList<Figure>> figureList = new ArrayList<>();
    @Override
    public void drawFigure() {
        figureList.forEach((list)->{
        list.forEach((figure)-> figure.drawFigure());
        System.out.println("End of Root!");
        }
        );

    }
    public void addFigure(Figure fig){
        ArrayList<Figure> figList= new ArrayList<Figure>();
        figList.add(fig);
        figureList.add(figList);
    }
    public void addComp(Composite comp){
        ArrayList <Figure> figList= new ArrayList<>();
        for (ArrayList<Figure> fig:comp.figureList){
           figList.addAll(fig); 
        }
        figureList.add(figList);
    }

    
}
