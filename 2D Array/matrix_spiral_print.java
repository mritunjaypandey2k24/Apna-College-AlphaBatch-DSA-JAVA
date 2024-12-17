public class matrix_spiral_print{

    public static void spiralPrint(int matrix [][]){
      int startRow = 0;
      int startCol = 0;
      int endRow =   matrix.length-1;
      int endCol = matrix[0].length-1;

      while(startRow <= endRow && startCol <= endCol ){

        //printing top part
        for(int j = startCol; j <= endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
          startRow++;

        // printint right side part
        for(int i =startRow; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+" ");
        }
          endCol--;

        // printing bottom part
          if(startRow != endRow){
            for(int j = endCol; j >= startCol; j--){
                
                System.out.print(matrix[endRow][j]+" ");
            }
              endRow--;
          }

        // printing left side part
          if(startCol != endCol){
            for(int i = endRow; i>= startRow; i--){
                System.out.print(matrix[i][startCol]+" ");
            }
              startCol++;
          }

       

      }

    }
    

    public static void main(String args[]){

        int matrix [][] = { 
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}

        };   
        
        spiralPrint(matrix);
    }
    
}
