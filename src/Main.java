public class Main {
    public static void main(String[] args) {

        /*int bin1 = 0101 | 0001;
        System.out.println("bin1 = "+bin1);


        int c = 0x11; // 10001
        int d = 0100; // ten decimal
        int e = 0x2; // ten binary 0010 - see table below
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c*d);
        System.out.println(c*e);*/


        /*int N = 29;
        int M = 5;
        //int result = (int)Math.log10(100);
        int result = N/M;
        //System.out.println("result = "+ result);


        //Math.floor()log10(100);

        *//*System.out.println("optimalChange(1).getCoin2() = "+ optimalChange(1).getCoin2());
        System.out.println("optimalChange(1).getBill5() = "+ optimalChange(1).getBill5());
        System.out.println("optimalChange(1).getBill10() = "+ optimalChange(1).getBill10());*//*

        System.out.println("optimalChange(6).getCoin2() = "+ optimalChange(31).getCoin2());
        System.out.println("optimalChange(6).getBill5() = "+ optimalChange(31).getBill5());
        System.out.println("optimalChange(6).getBill10() = "+ optimalChange(31).getBill10());

        System.out.println("optimalChange(10).getCoin2() = "+ optimalChange(10).getCoin2());
        System.out.println("optimalChange(10).getBill5() = "+ optimalChange(10).getBill5());
        System.out.println("optimalChange(10).getBill10() = "+ optimalChange(10).getBill10());*/

        System.out.println(14/5);
        System.out.println(14/2);
        System.out.println(14/3);
        //System.out.println(14/0);

        /*int a = 11++;

        System.out.println(a);
        Math.abs()
        Object*/
    }


    static Change optimalChange(long s){

        Change retour = new Change();
        if((s%5 != 0 && s%2 != 0) && (s%5)%2 != 0){
            return null;
        }


        retour.setBill10(s/10);

        if(s%10 != 0){

            long rest = s%10;

            if(rest%5 == 0 || (rest%5)%2 == 0){
                retour.setBill5(rest/5);
            } else {
                retour.setCoin2(rest/2);
            }

        }

        return retour;
    }

    static class Change {
        long coin2;
        long bill5;
        long bill10;

        public long getCoin2() {
            return coin2;
        }

        public void setCoin2(long coin2) {
            this.coin2 = coin2;
        }

        public long getBill5() {
            return bill5;
        }

        public void setBill5(long bill5) {
            this.bill5 = bill5;
        }

        public long getBill10() {
            return bill10;
        }

        public void setBill10(long bill10) {
            this.bill10 = bill10;
        }
    }
}