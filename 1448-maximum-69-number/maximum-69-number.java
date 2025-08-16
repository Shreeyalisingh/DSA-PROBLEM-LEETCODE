class Solution {
    public int maximum69Number(int num) {
        String numberAsString = String.valueOf(num);
        String modifiedNumber = numberAsString.replaceFirst("6", "9");
        return Integer.valueOf(modifiedNumber);
    }
}
