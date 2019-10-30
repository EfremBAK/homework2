import java.util.Random;

public class homework2 {
    public static void main(String[] args) {
    /*
    program 1
    .store 5 words
    .randomly printout 1 word
     */

        System.out.println("program 1");


        String[] words = {"one", "two", "three", "four", "five"};

        Random r = new Random();
        int x = r.nextInt(words.length);

        System.out.println(words[x]);

        System.out.println();System.out.println();

//program 2 starts here
        System.out.println("program 2");

        /*
        create 2 arrays (with 6 numbers each)
        randomly printout 2 elements from each array
        store it in a third array
        printout third array
         */

        int [] num1 ={12 ,52 ,36, 61,89,77};
        int [] num2 = {5,7,9,4,3,0};

        int q = r.nextInt(num1.length);
        int q2 = r.nextInt(num1.length);
        int p = r.nextInt(num2.length);
        int p2 = r.nextInt(num2.length);

        System.out.println("words from the first array are :" +num1[q]+ " & " + num1[q2]);
        System.out.println("words from the second array are :" +num2[p]+ " & "+num2[p2]);
int []num3 = {num1[q], num1[q2], num2[p], num2[p2]};
        /*

        the long way is
        int [] num3 = new int [4];
        num3[0] =num1[q];
        num3[1] = num1[q2];
        num3[2] = num2[p];
        num3[3] = num2[p2];*/
        System.out.print("third array has :");

        for (int i = 0; i<num3.length; i++)
        System.out.print( num3[i] + " " );
        System.out.println();
//enhanced loop
        for (int  i : num3){
            System.out.print(i + ", ");
        }

    }

}
