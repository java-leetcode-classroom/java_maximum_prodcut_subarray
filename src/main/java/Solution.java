public class Solution {
  public int maxProduct(int[] nums) {
    int res = nums[0];
    int currentMax = 1;
    int currentMin = 1;
    for (int num : nums) {
      int tempMax = currentMax * num;
      currentMax = Math.max(num, Math.max(currentMax*num, currentMin*num));
      currentMin = Math.min(num, Math.min(tempMax, currentMin*num));
      res = Math.max(res, currentMax);
    }
    return res;
  }
}
