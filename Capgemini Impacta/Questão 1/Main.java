class Main {
    public static void main(String args[]) {
        int i, n = 6, aux = 0;

        while (n > 0){
            for (i = 1; i < n; i++){
                System.out.print(" ");
            }
            for (i = 0; i <= aux ; i++){
                System.out.print("*");
            }
            System.out.println();
            n--;
            aux++;
        }
    }
}