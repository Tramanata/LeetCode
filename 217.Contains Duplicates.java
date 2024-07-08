// This solutions uses a hashset to feed the values within the nums array into it
// It then uses the functions defined for a HashSet (contains and add) to check if the value is in the set, if not, add that value to the set
// This has a time complexity of ____ and a space compexit of ____

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int number = nums[i];
            if(set.contains(number)){
                return true;
            }else{
                set.add(number);
            }
        }
        return false;
    }
}
