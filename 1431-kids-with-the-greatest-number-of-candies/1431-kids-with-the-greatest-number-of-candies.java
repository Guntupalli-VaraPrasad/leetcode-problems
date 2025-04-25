class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int x = Arrays.stream(candies).max().getAsInt();
     List<Boolean> l = new ArrayList<>();
     for(int i=0;i<candies.length;i++) {
            int a = candies[i] + extraCandies;
            if(a>=x) {
                l.add(true);
            }
            else {
                l.add(false);
            }
     } 
    return l;
    }

}