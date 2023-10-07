package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first = 1;
        int second = 10;
        int third = 100;

        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        first = 15;
        second = 6;
        third = 4;

        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third: " + third);
        System.out.println("linkToFirst: " + linkToFirst);
        System.out.println("linkToSecond: " + linkToSecond);
        System.out.println("linkToThird: " + linkToThird);
    }
}
