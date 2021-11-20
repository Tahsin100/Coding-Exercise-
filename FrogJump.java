public class FrogJump {
    public FrogJump() {

        int X = 10;
        int Y = 70;
        int D = 30;

        int dist = Math.abs(Y-X);
        int jump = dist/D;
        if(dist % D > 0) {
            jump = jump+1;
        }
        System.out.println(jump);
    }
}
