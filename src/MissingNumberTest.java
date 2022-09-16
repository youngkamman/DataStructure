 import static org.junit.Assert.*;

 import org.junit.Test;

 public class MissingNumberTest {
     public static void main(String[] args) {

     }
   private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
   private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
   private missingNumber mn = new missingNumber();

   @Test
   public void testMissingNumber_MissingMax() {
 	  assertEquals(10, mn.missingNumberSort(missingMax, 10));
   }

   @Test
   public void testMissingNumber_NoneMissing() {
 	  assertEquals(0, mn.missingNumberSort(missingNone, 10));
   }

   @Test
   public void testMissingNumber_MissingSeven() {
 	  assertEquals(7, mn.missingNumberSort(missingSeven, 10));
   }


 }

