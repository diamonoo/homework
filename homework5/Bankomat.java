package homework5;

class Bankomat {
    private int numOf20, numOf50, numOf100;
    Bankomat(int numOf20, int numOf50, int numOf100){
        this.numOf20= numOf20;
        this.numOf50= numOf50;
        this.numOf100=numOf100;
    }
    void add(int nominal, int num){
        switch (nominal){
            case 20:
                numOf20+=num; break;
            case 50:
                numOf50+=num; break;
            case 100:
                numOf100+=num; break;
            default:
                System.out.println("wrong type");
        }
    }
    boolean get(int s) {
        for (int i = Math.min(s / 100, numOf100); i >= 0; i--)
            for (int j = Math.min(s / 50, numOf100); j >= 0; j--)
                for (int k = Math.min(s / 20, numOf100); k >= 0; k--)
                    if (i * 100 + j * 50 + k * 20 == s) {
                        System.out.println(i + " 100-k, " + j + " 50-k, " + k + " 20-k. ");
                        //   add( 100,-i); add( 50,-j); add( 20,-k);
                        return true;
                    }
        return false;
    }
}
