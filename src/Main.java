import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        clear();
        intro();
        wait(1000);
        clear();
        verse1();
        wait(1000);
        clear();
        chorus1();
        wait(1000);
        clear();
        chorus2();
        wait(1000);
        clear();
        breakdown();
        wait(1000);
        clear();
        outro();
    }

    public static void intro()
    {
        System.out.println("Song Title: Ghosts N Stuff");
    }
    public static void clear()
    {
        System.out.print("\033[H\033[2J");
    }
    public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void verse1() {
        System.out.println("It's been so long I've been out of my body with you");
        System.out.println("I feel alone feel at home feel like nothing is true");
        System.out.println("You take me to a place where my senses gave way");
        System.out.println("Turn it round shut it down what the people say");
        System.out.println("Climbing up coming down gonna give you some");
        System.out.println("Take my hand and let it come let it come let it");
    }
    public static void chorus1() {
        System.out.println("Take it back when she knows that you're doing it right");
        System.out.println("'Cause everybody else knows what they're taking tonight");
        System.out.println("But I just wanna play it right");
        System.out.println("We we're gonna get there tonight");
    }
    public static void verse2() {
        System.out.println("It's been so far I've been walking the line on my own");
        System.out.println("Lift me up to the stars we are coming home");
        System.out.println("I know we had a chase but we're out of time");
        System.out.println("We have sold in the cold physical design");
        System.out.println("Set me free set me out on the run");
        System.out.println("Lift me up to the sun to the sun to the");
    }
    public static void chorus2() {
        System.out.println("When you're burning down when you're burning down");
        System.out.println("It's the way that you fake it I know it's too late");
    }
    public static void breakdown() {
        System.out.println("But I just want to play it right");
        System.out.println("We we're gonna get there tonight");
        System.out.println("I just want to take you down");
        System.out.println("We we're gonna bring you round");
    }
    public static void outro() {
        System.out.println("I just want to play it right");
        System.out.println("We, we're gonna get there tonight");
    }
}