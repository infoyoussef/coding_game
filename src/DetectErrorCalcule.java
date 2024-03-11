import java.util.Arrays;

public class DetectErrorCalcule {

    public static void main(String[] args) {

        /*System.out.println("result = "+detcter(45, 89, 134));

        System.out.println("result = "+detcter(235, 456, 691));*/
        System.out.println("result = "+detcter(45, 10, 59));/*
        System.out.println("result = "+detcter(45, 89, 134));
        System.out.println("result = "+detcter(0, 1, 1));*/

    }

    public static String detcter(int valOne, int valTwo, int sommeEntree){

        String retour = "OK";

        int sommeExpected = valOne + valTwo;

        System.out.println("sommeEntree = "+sommeEntree);
        System.out.println("sommeExpected = "+sommeExpected);

        if(sommeExpected == sommeEntree){
            return retour;
        }

        System.out.println("valOne = "+valOne);
        System.out.println("valTwo = "+valTwo);


        String valOneString = new StringBuilder().append(sommeEntree).reverse().toString();

        String valTwoString = new StringBuilder().append(sommeExpected).reverse().toString();

        /*int[] result = new int[valTwoString.length];
        int sum =  Arrays.stream(result).;*/


        System.out.println("valOneString = "+valOneString);
        System.out.println("valTwoString = "+valTwoString);

        for (int i = 0; i < valOneString.length(); i++) {
            if (valOneString.charAt(i) != valTwoString.charAt(i)) {
                retour = Integer.toString(i);
            }
        }

        return retour;

    }
}
