//elif

int a = 4;
int result = a == 4 ? 1 : 8;

// result will be 1
// This is equivalent to
int result;

if (a == 4) {
    result = 1;
} else {
    result = 8;
}

// loops
public class Test {

   public static void main(String args[]){
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names ={"James", "Larry", "Tom", "Lacy"};
      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}
