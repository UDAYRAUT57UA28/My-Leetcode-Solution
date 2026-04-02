class Solution {
    public int punishmentNumber(int n) {
        int punishment_no = 0;
        for(int i=1;i<=n;i++){
            int square = i*i;
            if (canPartition(String.valueOf(square), i, 0, 0)) {
                punishment_no += square;
            }
        }
        return punishment_no;
    }

    private boolean canPartition(String s, int target, int index, int currentSum) {
        if (index == s.length()) {
            return currentSum == target;
        }
        for (int j = index; j < s.length(); j++) {
            String part = s.substring(index, j + 1);
            int val = Integer.parseInt(part);
            if (currentSum + val > target) {
                break;
            }
            if (canPartition(s, target, j + 1, currentSum + val)) {
                return true;
            }
        }
        return false;
    }
}