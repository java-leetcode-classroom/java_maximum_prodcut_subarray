import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void maxProductExample1() {
    assertEquals(6, sol.maxProduct(new int[]{2,3,-2,4}));
  }
  @Test
  void maxProductExample2() {
    assertEquals(0, sol.maxProduct(new int[]{-2,0,-1}));
  }
}