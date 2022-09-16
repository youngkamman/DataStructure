 import static org.junit.Assert.*;

 import org.junit.Test;
public class BalancedBracketsTest {
       String emptyString = "";
   String balancedAngleBrackets = "<<>>";
   String balancedComboBrackets = "<({})>";
   String mismatchedBrackets = "<({)}>";

   balancedBrackets bb = new balancedBrackets();

   @Test
   public void testBalancedBrackets_balancedParens() {
 	  assertTrue(bb.balancedBrackets("(1)"));
   }

   @Test
   public void testBalancedBrackets_tooManyOpenParens() {
 	  assertFalse(bb.balancedBrackets("({1)"));
   }

   @Test
   public void testBalancedBrackets_tooManyClosedParens() {
 	  assertFalse(bb.balancedBrackets("({1})>"));
   }

   @Test
   public void testBalancedBrackets_startWithClosedParens() {
 	  assertFalse(bb.balancedBrackets(")("));
   }

   @Test
   public void testBalancedBrackets_emptyString() {
 	  assertTrue(bb.balancedBrackets(""));
   }

   @Test
   public void testBalancedBrackets_balancedComboBrackets() {
 	  assertTrue(bb.balancedBrackets("<({})>"));
   }

   @Test
   public void testBalancedBrackets_mismatchedBrackets() {
 	  assertTrue(bb.balancedBrackets("<({)}>"));
   }

 }


