//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Movable_point movablePoint=new Movable_point(4,3,2,1);
        System.out.println("X= "+movablePoint.getX());
        System.out.println("X speed= "+movablePoint.getxSpeed());
        System.out.println("Y= "+movablePoint.getY());
        System.out.println("Y speed= "+movablePoint.getySpeed());

       movablePoint.moveUp();
        System.out.println("After move up Y= "+movablePoint.getY()+"\nX= "+movablePoint.getX());
       movablePoint.moveRight();
        System.out.println("After move right Y= "+movablePoint.getY()+"\nX= "+movablePoint.getX());
        movablePoint.moveLeft();
        System.out.println("After move left Y= "+movablePoint.getY()+"\nX= "+movablePoint.getX());
        movablePoint.moveDown();
        System.out.println("After move down Y= "+movablePoint.getY()+"\nX= "+movablePoint.getX());





    }
}