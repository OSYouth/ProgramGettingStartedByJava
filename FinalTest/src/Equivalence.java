public class Equivalence {
    public int t=4;
    public static void main(String[] args) {
        new Equivalence().NumberPlay();
    }
    public void NumberPlay() {
        int t=2;
        t = t+5;
        this.t = this.t-2;
        t = t-this.t;
        System.out.println(t+this.t+"ok");
    }
}