// GFG PYQ - 2 points
// Company Tags
// Amazon, Adobe, Google, Facebook, Microsoft, Uber
// Topic Tags
// prefix-sum, Arrays, Data Structures, Algorithms

class Solution {
    public static int findEquilibrium(int arr[]) {
        
        int n = arr.length;
        int totalSum = 0;
        for (int x : arr) {
            totalSum += x;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            
            leftSum += arr[i];
        }
        return -1;
    }
}
