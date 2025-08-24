public class Ferret implements Comparable{
    private double len;
    
    public Ferret (double l) {
        len = l;
    }
    
    public double getLength(){
        return len;
    }
    
    public void setLength(double l) {
        len = l;
    }
    
    public int compareTo(Object second) {
        if (second == null || !(second instanceof Ferret)) {
            return -1;
        } else {
            Ferret sec = (Ferret)second;
            if (this.len > sec.len) return 1;
            if (this.len<sec.len) return -1;
            else return 0;
        }
    }
    
}
