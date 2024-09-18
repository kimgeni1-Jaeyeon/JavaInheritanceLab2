class Circle{
    double radius;
    String color;

    public Circle()
    {
        this.radius = 12;
        this.color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Circle{
    double height;

    public Cylinder(){
        this.radius = super.getRadius();
        this.height = 12;
    }
    public Cylinder(double radius){
        this.radius = radius;
        this.height = 12;
    }
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    double getHeight(){
        return height;
    }
    double getVolume(){
        return getArea() * getHeight(); // getArea super.를 붙이든 안붙이든 똑같다.
    }
}

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder();
        System.out.println("obj1의 원반지름: " + obj1.getRadius() + " obj1의 높이: " + obj1.getHeight());

        Cylinder obj2 = new Cylinder(5.0, 3.0);
        System.out.println("obj2의 원반지름: " + obj2.getRadius() + " obj2의 높이: " + obj2.getHeight());

    }
}