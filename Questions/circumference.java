package Questions;
public class circumference {
    
    public static void main(String[] args) {
        float ans = circumferenceOfCircle(5);
        System.out.println(ans);
    }
    public static float circumferenceOfCircle(int radius) {
        float circumference = 2 * 3.14f * radius;
        return circumference;
    }
}
