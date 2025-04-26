class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int x = flowerbed.length;
       int c= 0;
       for(int i=0;i<x;i++)
       {
         if (flowerbed[i] == 0 
         && (i == 0 || flowerbed[i-1] == 0) 
         && (i == x-1 || flowerbed[i+1] == 0)) 
        {
            flowerbed[i]=1;
            c++;
            i++;
        }
       }
       return n <= c; 
    }      
}