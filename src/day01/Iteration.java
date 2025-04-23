package day01;

public class Iteration {
    public static void main(String[] args) throws InterruptedException {
        /*drawHorizontal(5);
        System.out.println();
        drawVertical(5);
        System.out.println();

        drawBox(5);*/
        //triangle1(5);

       /* triangle2(5);
        triangle3(5);*/
        triangle4(5);

    }

    public static void triangle1(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                Thread.sleep(400);
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void triangle2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void triangle3(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Thread.sleep(400);
                if (i <= j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle4(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Thread.sleep(100);
                if (j < n-i-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void drawBox(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Thread.sleep(500);
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawHorizontal(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }

    public static void drawVertical(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(" * ");
        }
    }


}
