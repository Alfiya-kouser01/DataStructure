public class plus_One {
    public static void main(String[] args) {
        int []arr={9,9};
        plusOne(arr);
        //for(int i=0;i<arr.length;i++)
       // System.out.println(arr[i]);

    }

    private static int[]  plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
       for(int i=0;i<digits.length;i++){
           System.out.println(digits[i]);
       }
        return digits;

    }


}
