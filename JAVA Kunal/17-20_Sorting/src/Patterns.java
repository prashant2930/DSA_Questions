public class Patterns {
    public static void main(String[] args) {
        pattern5(5);

    }
    static void pattern5(int n){
        for(int row = 0;row<2*n;row++){
            int totalcolumns= row>n? 2*n-row:row;
            for (int col = 0; col < totalcolumns; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
