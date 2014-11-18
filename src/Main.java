public class Main {
    public static void main(String[] args){
        int [][] trianglePascal = new int[10][10];
        for (int i = 0; i < trianglePascal.length; i++){
            for (int j = 0; j <= i; j++){
                trianglePascal[i][0] = 1;
                trianglePascal[i][i] = 1;
                /*if (i > 1){
                    trianglePascal[i][1] = i;
                    trianglePascal[i][i - 1] = i;
                }
                /*if (i > 2){
                    trianglePascal[i][2] = i * (i - 1) / 2;
                }
                if (i > 3 && trianglePascal[i][j] == 0){
                    int n = i - 3;
                    trianglePascal[i][3] = n * (n + 1) * (n + 2) / 6;
                }*/
                if (i > 1 && trianglePascal[i][j] == 0){
                    trianglePascal[i][j] = trianglePascal[i - 1][j -1] + trianglePascal[i - 1][j];
                }

                System.out.print(trianglePascal[i][j] + " ");
            }
            System.out.println();
        }

    }

}
