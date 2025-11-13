class Circle extends Shape {
    private double radious;

    public Circle (double radious){
        this.radious = radious;
    }
@Override
double area (){
    return Math.PI * radious * radious; // Area of Circle
}
}