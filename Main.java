package OCP;

public class Main {
    public static void makeBirdFly(Bird bird){
        bird.fly();
    }
    public static void main(String[]args){
        Eagle eagle=new Eagle();
        Penguin penguin=new Penguin();
        makeBirdFly(eagle);
        makeBirdFly(penguin);
    }
}
 