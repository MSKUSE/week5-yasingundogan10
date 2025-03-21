public class Rectangle {


    private  Point topLeft;
    private int sideA ,sideB ;



    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA) ;
        setSideB(sideA);


    }

    public Point getTopLeft() {
        return topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int perimeter(){
        return (2 * this.sideA) + (2 * this.sideB) ;
    }


    public int area(){
        return this.sideA * this.sideB ;
    }

    public void setTopLeft(Point topLeft) {
        if (sideA < 0) {
            this.sideA = 0;
            System.out.println("Side A can't be 0");

        } else {
            this.topLeft = topLeft;
        }
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
            this.sideB = 0;
            System.out.println("Side B can't 0");

        }
        else{
            this.sideB = sideB;
        }
    }

    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideB(sideB);
        setSideA(sideA);








    }
}
