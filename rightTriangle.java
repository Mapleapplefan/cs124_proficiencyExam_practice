public class RightTriangle extends Shape {
    private int side;
    
    public RightTriangle(int s) {
        super("righttriangle");
        side = s;
    }
    
    public double area () {
        return 0.5*side*side;
    }
    
    @Override 
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other instanceof RightTriangle) {
            RightTriangle oth = (RightTriangle)other;
            if (oth.side == this.side){
                return true;
            }
        } 
        return false;
    }
}
