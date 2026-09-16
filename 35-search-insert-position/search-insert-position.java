class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums)
         list.add(i);
        if(list.contains(target))
         return list.indexOf(target);
        else list.add(target);
        list.sort(null);
        return list.indexOf(target);
            
        
    }
}