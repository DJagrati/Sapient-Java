public class Arrays{

    static int row = 4;
    static int col = 4;
    static int initial = 10;

    public static void main(String args[]){
        

        int TDArray[][]  = new int[row][col];
        populateArray(TDArray);
        displayArray(TDArray);
  
    }

    private static void populateArray(int[][] TDArray){

        for (int r =0; r < row ; r++){
            
            for( int c = 0; c < col; c++){

                TDArray[r][c] = initial++;
                
            }
        }
    }

    private static void displayArray(int[][] TDArray){

        for (int r =0; r < row ; r++){
            
            for(int c = 0; c < col; c++){

                System.out.print(TDArray[r][c] + "\t");
                
            }
            System.out.println();
        }

    }
}